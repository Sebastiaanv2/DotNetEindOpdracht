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
            StoreProxy = new StoreServiceClient();
        }

        public StoreServiceClient StoreProxy { get; private set; }
        public UserDTO User { get; set; }
    }
}
