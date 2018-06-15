//using StoreServerLibrary.daos;
using StoreServerLibrary.daos;
using StoreServerLibrary.dto;
using StoreServerLibrary.helper;
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
        private IProductDAO productDAO;
        private IUserDAO userDAO;

        public StoreService()
        {
            // Register maps
            MappingConfig.RegisterMaps();

            // Register DAO's
            productDAO = new ProductDAO();
            userDAO = new UserDAO();
        }

        public bool BuyProduct(UserDTO user, int productId, int amount)
        {
            ProductDTO foundProduct = productDAO.GetProduct(productId);

            if (foundProduct.stock < amount) return false;

            if (user.saldo < foundProduct.price * amount) return false;

            // Update stock
            foundProduct.stock -= amount;
            productDAO.UpdateProduct(foundProduct);

            // Update user saldo and add product to inventory
            user.saldo -= foundProduct.price * amount;

            // Update user saldo
            userDAO.UpdateUser(user);

            // Add new row to user inventory
            userDAO.AddInventoryItem(user, new InventoryDTO { product = foundProduct, amount = amount });

            return true;
        }

        public UserDTO FindUser(int userId)
        {
            return userDAO.GetUser(userId);
        }

        public List<InventoryDTO> GetInventory(UserDTO currentUser)
        {
            return userDAO.GetInventory(currentUser);
        }

        public List<ProductDTO> GetProducts()
        {
            return productDAO.GetAllProducts();
        }

        public UserDTO Login(string username, string password)
        {
            using (var context = new WebshopEntities())
            {
                var users = from u in context.users
                            where u.username == username
                            && u.password == password
                            select u;

                if(users.Count() == 1)
                {
                    var userDTO = AutoMapper.Mapper.Map<user, UserDTO>(users.First());

                    return userDTO;
                }
            }

            return null;
        }

        public UserDTO Register(string username)
        {
            return userDAO.RegisterUser(username);
        }

    }
}
