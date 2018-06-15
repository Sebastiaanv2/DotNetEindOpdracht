using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.dto
{
    public class ProductDTO
    {
        public int id { get; set; }
        public string name { get; set; }
        public float price { get; set; }
        public int stock { get; set; }
    }


}
