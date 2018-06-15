using StoreServerLibrary.dto;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreServerLibrary.daos
{
    interface IUserDAO
    {
        UserDTO RegisterUser(string username);
        UserDTO GetUser(int userId);
        List<InventoryDTO> GetInventory(UserDTO currentUser);
        UserDTO UpdateUser(UserDTO newUser);
        bool AddInventoryItem(UserDTO currentUser, InventoryDTO inv);
    }
}
