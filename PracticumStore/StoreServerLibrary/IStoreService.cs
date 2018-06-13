using StoreServerLibrary.domain;
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
        string Register(string username);

        [OperationContract]
        User Login(string username, string password);

        [OperationContract]
        List<Product> GetProducts();

        [OperationContract]
        bool BuyProduct(int userId, int productId, int amount);

        [OperationContract]
        List<Product> GetInventory(int userId);

        [OperationContract]
        User FindUser(int userId);
    }
}
