using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.domain
{
    public class Product
    {
        public int id { get; set; }
        public string name { get; set; }
        public float price { get; set; }
        public int stock { get; set; }
    }
}
