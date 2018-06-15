using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using StoreServerLibrary.dto;

namespace StoreServerLibrary.daos
{
    public class UserDAO : BaseDAO, IUserDAO
    {
        public List<InventoryDTO> GetInventory(UserDTO currentUser)
        {
            var foundUser = context.users.SingleOrDefault(u => u.username == currentUser.username);
            if (foundUser == null) return null;

            // Map inventory to list
            return AutoMapper.Mapper.Map<List<inventory>, List<InventoryDTO>>(foundUser.inventories.OrderByDescending(x=>x.id).ToList());
        }

        public UserDTO GetUser(int userId)
        {
            var foundUser = context.users.SingleOrDefault(u => u.id == userId);
            if (foundUser == null) return null;

            // Map inventory to list
            return AutoMapper.Mapper.Map<user, UserDTO>(foundUser);
        }

        public UserDTO RegisterUser(string username)
        {
            // Check if user doesn't exist
            var foundUser = context.users.SingleOrDefault(u => u.username == username);
            if (foundUser != null) return null;

            Random random = new Random();

            user newUser = new user {
                username = username,
                password = base.Reverse(username),
                saldo = (float)Math.Round((random.NextDouble() * 1001), 2)
            };

            context.users.Add(newUser);
            context.SaveChanges();

            // Return new user
            return AutoMapper.Mapper.Map<user, UserDTO>(newUser);
        }

        public UserDTO UpdateUser(UserDTO currentUser)
        {
            // Find user by id
            var foundUser = context.users.SingleOrDefault(u => u.id == currentUser.id);

            // Update user product
            foundUser.username = currentUser.username;
            foundUser.saldo = currentUser.saldo;

            // Save found user
            context.SaveChanges();

            // Return new user
            return AutoMapper.Mapper.Map<user, UserDTO>(foundUser);
        }

        public bool AddInventoryItem(UserDTO currentUser, InventoryDTO inv)
        {
            // Find user by id
            var foundUser = context.users.SingleOrDefault(u => u.id == currentUser.id);

            // Get product
            var foundProduct = context.products.SingleOrDefault(p => p.id == inv.product.id);

            inventory newInventory = new inventory
            {
                user_id = foundUser.id,
                user = foundUser,
                product_id = foundProduct.id,
                product = foundProduct,
                total_price = foundProduct.price * inv.amount,
                amount = inv.amount
            };

            foundUser.inventories.Add(newInventory);
            context.Set<inventory>().Add(newInventory);
            context.SaveChanges();

            return true;
        }
    }
}
