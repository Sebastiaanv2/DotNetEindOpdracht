using StoreClient.StoreService;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace StoreClient
{
    /// <summary>
    /// Interaction logic for StoreWindow.xaml
    /// </summary>
    public partial class StoreWindow : Window
    {
        private StoreServiceClient storeProxy;

        private ObservableCollection<ProductDTO> products;
        private ObservableCollection<InventoryDTO> inventory;

        public ObservableCollection<ProductDTO> Products
        {
            get
            {
                if (products == null)
                {
                    products = new ObservableCollection<ProductDTO>();
                }

                return products;
            }
        }

        public ObservableCollection<InventoryDTO> Inventory
        {
            get
            {
                if (inventory == null)
                {
                    inventory = new ObservableCollection<InventoryDTO>();
                }

                return inventory;
            }
        }

        public StoreWindow()
        {
            InitializeComponent();

            storeProxy = ((App)Application.Current).StoreProxy;

            RefreshScreen();
        }

        private void RefreshScreen()
        {
            Products.Clear();
            foreach (var p in storeProxy.GetProducts())
            {
                Products.Add(p);
            }

            Inventory.Clear();
            foreach (var i in storeProxy.GetInventory(((App)Application.Current).User))
            {
                Inventory.Add(i);
            }

            ProductsLB.DataContext = Products;
            InventoryLB.DataContext = Inventory;

            // Update user
            ((App)Application.Current).User = storeProxy.FindUser(((App)Application.Current).User.id);

            SaldoLBL.Content = "Saldo: € " + ((App)Application.Current).User.saldo;
            AmountTXT.Text = "0";
            MessageLBL.Content = "";
        }

        private void OrderBTN_Click(object sender, RoutedEventArgs e)
        {
            if (AmountTXT.Text == "" || Int32.Parse(AmountTXT.Text) == 0)
            {
                MessageLBL.Foreground = new SolidColorBrush(Colors.Red);
                MessageLBL.Content = "Kies minimaal 1 bij amount!";
                return;
            }

            var p = ProductsLB.SelectedItem as ProductDTO;

            if (p == null)
            {
                MessageLBL.Foreground = new SolidColorBrush(Colors.Red);
                MessageLBL.Content = "Geen product geselecteerd!";
                return;
            }

            if (storeProxy.BuyProduct(((App)Application.Current).User, p.id, Int32.Parse(AmountTXT.Text)))
            {
                RefreshScreen();

            }
            else
            {
                MessageLBL.Foreground = new SolidColorBrush(Colors.Red);
                MessageLBL.Content = "Niet genoeg producten op voorraad of niet genoeg saldo!";
            }

            
        }

        private void NumberValidationTextBox(object sender, TextCompositionEventArgs e)
        {
            Regex regex = new Regex("[^0-9]+");
            e.Handled = regex.IsMatch(e.Text);
        }
    }
}
