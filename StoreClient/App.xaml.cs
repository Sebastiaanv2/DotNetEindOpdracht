using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Threading.Tasks;
using System.Windows;
using StoreClient.StoreService;

namespace StoreClient
{
    /// <summary>
    /// Interaction logic for App.xaml
    /// </summary>
    public partial class App : Application
    {


        public App()
        {
            using (StoreServiceClient storeProxy = new StoreServiceClient())
            {
                //Console.WriteLine(storeProxy.GetProducts());

                //Console.WriteLine(storeProxy.Login("test", "test"));

                foreach (Product p in storeProxy.GetInventory(1))
                {
                    Console.WriteLine(p.name);
                }
            }
        }
    }
}
