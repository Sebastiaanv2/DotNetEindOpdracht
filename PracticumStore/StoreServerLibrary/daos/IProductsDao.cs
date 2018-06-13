using StoreServerLibrary.domain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.daos
{
    interface IProductsDao
    {
        List<Product> GetProductsInStock();
        List<Product> GetUserInventory(int userId);
        bool BuyProduct(int userId, int productId, int amount);
    }
}
