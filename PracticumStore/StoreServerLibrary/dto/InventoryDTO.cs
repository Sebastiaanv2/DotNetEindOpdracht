using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.dto
{
    public class InventoryDTO
    {
        public int product_id { get; set; }
        public int user_id { get; set; }

        public int amount { get; set; }
        public float total_price { get; set; }
        public ProductDTO product { get; set; }
    }
}
