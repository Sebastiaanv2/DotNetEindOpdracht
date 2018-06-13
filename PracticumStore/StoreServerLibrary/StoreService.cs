using StoreServerLibrary.daos;
using StoreServerLibrary.domain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace StoreServerLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "StoreService" in both code and config file together.
    public class StoreService : IStoreService
    {
        private IProductsDao productsDao;

        public StoreService()
        {
            productsDao = new ProductsDao();
        }

        public bool BuyProduct(int productId, int amount)
        {
            Console.WriteLine(productId + " - " + amount);

            return true;
        }

        public bool BuyProduct(int userId, int productId, int amount)
        {
            throw new NotImplementedException();
        }

        public User FindUser(int userId)
        {
            throw new NotImplementedException();
        }

        public List<Product> GetInventory(int userId)
        {
            return productsDao.GetUserInventory(userId);
        }

        public List<Product> GetProducts()
        {
            return productsDao.GetProductsInStock();
        }

        public User Login(string username, string password)
        {
            throw new NotImplementedException();
        }

        public string Register(string username)
        {
            throw new NotImplementedException();
        }

    }
}
