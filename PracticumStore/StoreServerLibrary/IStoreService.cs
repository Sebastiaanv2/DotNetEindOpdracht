using StoreServerLibrary.dto;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace StoreServerLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IStoreService" in both code and config file together.
    [ServiceContract]
    public interface IStoreService
    {
        [OperationContract]
        UserDTO Register(string username);

        [OperationContract]
        UserDTO Login(string username, string password);

        [OperationContract]
        List<ProductDTO> GetProducts();

        [OperationContract]
        bool BuyProduct(UserDTO user, int productId, int amount);

        [OperationContract]
        List<InventoryDTO> GetInventory(UserDTO currentUser);

        [OperationContract]
        UserDTO FindUser(int userId);
    }
}
