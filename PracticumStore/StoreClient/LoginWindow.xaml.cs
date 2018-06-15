using StoreClient.StoreService;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace StoreClient
{
    /// <summary>
    /// Interaction logic for LoginWindow.xaml
    /// </summary>
    public partial class LoginWindow : Window
    {
        private StoreServiceClient storeProxy;

        public LoginWindow()
        {
            InitializeComponent();

            storeProxy = ((App)Application.Current).StoreProxy;
        }

        private void LoginBTN_Click(object sender, RoutedEventArgs e)
        {
            UserDTO user = storeProxy.Login(LoginUsernameTXT.Text, LoginPasswordTXT.Password);

            if (user != null)
            {
                ((App)Application.Current).User = user;
                LoginMessageLBL.Content = "";

                // Go to store screen
                this.Hide();
                var storeWindow = new StoreWindow();
                storeWindow.ShowDialog();
                this.Close();
            }
            else
            {
                LoginMessageLBL.Foreground = new SolidColorBrush(Colors.Red);
                LoginMessageLBL.Content = "Username or Password is wrong.";
            }
        }

        private void RegisterBTN_Click(object sender, RoutedEventArgs e)
        {
            UserDTO newUser = storeProxy.Register(RegisterUsernameTXT.Text);

            if (newUser != null)
            {
                RegisterMessageLBL.Foreground = new SolidColorBrush(Colors.Black);
                RegisterMessageLBL.Content = "Your new password: " + newUser.password;
            }
            else
            {
                RegisterMessageLBL.Foreground = new SolidColorBrush(Colors.Red);
                RegisterMessageLBL.Content = "Username allready exists!";
            }
        }
    }
}
