using StoreServerLibrary;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace StoreHost
{
    class Program
    {
        static void Main(string[] args)
        {
            using (ServiceHost host = new ServiceHost(typeof(StoreService)))
            {
                host.Open();
                Console.WriteLine("==============================\n    Store Service Started!    \n==============================");
                Console.ReadKey();
            }
        }
    }
}
