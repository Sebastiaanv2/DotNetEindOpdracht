﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace StoreClient.StoreService {
    using System.Runtime.Serialization;
    using System;
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="User", Namespace="http://schemas.datacontract.org/2004/07/StoreServerLibrary.domain")]
    [System.SerializableAttribute()]
    public partial class User : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int idField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private StoreClient.StoreService.Product[] inventoryField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string passwordField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private float saldoField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string usernameField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int id {
            get {
                return this.idField;
            }
            set {
                if ((this.idField.Equals(value) != true)) {
                    this.idField = value;
                    this.RaisePropertyChanged("id");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public StoreClient.StoreService.Product[] inventory {
            get {
                return this.inventoryField;
            }
            set {
                if ((object.ReferenceEquals(this.inventoryField, value) != true)) {
                    this.inventoryField = value;
                    this.RaisePropertyChanged("inventory");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string password {
            get {
                return this.passwordField;
            }
            set {
                if ((object.ReferenceEquals(this.passwordField, value) != true)) {
                    this.passwordField = value;
                    this.RaisePropertyChanged("password");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public float saldo {
            get {
                return this.saldoField;
            }
            set {
                if ((this.saldoField.Equals(value) != true)) {
                    this.saldoField = value;
                    this.RaisePropertyChanged("saldo");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string username {
            get {
                return this.usernameField;
            }
            set {
                if ((object.ReferenceEquals(this.usernameField, value) != true)) {
                    this.usernameField = value;
                    this.RaisePropertyChanged("username");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="Product", Namespace="http://schemas.datacontract.org/2004/07/StoreServerLibrary.domain")]
    [System.SerializableAttribute()]
    public partial class Product : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int idField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string nameField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private float priceField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int stockField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int id {
            get {
                return this.idField;
            }
            set {
                if ((this.idField.Equals(value) != true)) {
                    this.idField = value;
                    this.RaisePropertyChanged("id");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string name {
            get {
                return this.nameField;
            }
            set {
                if ((object.ReferenceEquals(this.nameField, value) != true)) {
                    this.nameField = value;
                    this.RaisePropertyChanged("name");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public float price {
            get {
                return this.priceField;
            }
            set {
                if ((this.priceField.Equals(value) != true)) {
                    this.priceField = value;
                    this.RaisePropertyChanged("price");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int stock {
            get {
                return this.stockField;
            }
            set {
                if ((this.stockField.Equals(value) != true)) {
                    this.stockField = value;
                    this.RaisePropertyChanged("stock");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="StoreService.IStoreService")]
    public interface IStoreService {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/Register", ReplyAction="http://tempuri.org/IStoreService/RegisterResponse")]
        string Register(string username);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/Register", ReplyAction="http://tempuri.org/IStoreService/RegisterResponse")]
        System.Threading.Tasks.Task<string> RegisterAsync(string username);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/Login", ReplyAction="http://tempuri.org/IStoreService/LoginResponse")]
        StoreClient.StoreService.User Login(string username, string password);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/Login", ReplyAction="http://tempuri.org/IStoreService/LoginResponse")]
        System.Threading.Tasks.Task<StoreClient.StoreService.User> LoginAsync(string username, string password);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/GetProducts", ReplyAction="http://tempuri.org/IStoreService/GetProductsResponse")]
        StoreClient.StoreService.Product[] GetProducts();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/GetProducts", ReplyAction="http://tempuri.org/IStoreService/GetProductsResponse")]
        System.Threading.Tasks.Task<StoreClient.StoreService.Product[]> GetProductsAsync();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/BuyProduct", ReplyAction="http://tempuri.org/IStoreService/BuyProductResponse")]
        bool BuyProduct(int userId, int productId, int amount);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/BuyProduct", ReplyAction="http://tempuri.org/IStoreService/BuyProductResponse")]
        System.Threading.Tasks.Task<bool> BuyProductAsync(int userId, int productId, int amount);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/GetInventory", ReplyAction="http://tempuri.org/IStoreService/GetInventoryResponse")]
        StoreClient.StoreService.Product[] GetInventory(int userId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IStoreService/GetInventory", ReplyAction="http://tempuri.org/IStoreService/GetInventoryResponse")]
        System.Threading.Tasks.Task<StoreClient.StoreService.Product[]> GetInventoryAsync(int userId);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface IStoreServiceChannel : StoreClient.StoreService.IStoreService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class StoreServiceClient : System.ServiceModel.ClientBase<StoreClient.StoreService.IStoreService>, StoreClient.StoreService.IStoreService {
        
        public StoreServiceClient() {
        }
        
        public StoreServiceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public StoreServiceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public StoreServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public StoreServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public string Register(string username) {
            return base.Channel.Register(username);
        }
        
        public System.Threading.Tasks.Task<string> RegisterAsync(string username) {
            return base.Channel.RegisterAsync(username);
        }
        
        public StoreClient.StoreService.User Login(string username, string password) {
            return base.Channel.Login(username, password);
        }
        
        public System.Threading.Tasks.Task<StoreClient.StoreService.User> LoginAsync(string username, string password) {
            return base.Channel.LoginAsync(username, password);
        }
        
        public StoreClient.StoreService.Product[] GetProducts() {
            return base.Channel.GetProducts();
        }
        
        public System.Threading.Tasks.Task<StoreClient.StoreService.Product[]> GetProductsAsync() {
            return base.Channel.GetProductsAsync();
        }
        
        public bool BuyProduct(int userId, int productId, int amount) {
            return base.Channel.BuyProduct(userId, productId, amount);
        }
        
        public System.Threading.Tasks.Task<bool> BuyProductAsync(int userId, int productId, int amount) {
            return base.Channel.BuyProductAsync(userId, productId, amount);
        }
        
        public StoreClient.StoreService.Product[] GetInventory(int userId) {
            return base.Channel.GetInventory(userId);
        }
        
        public System.Threading.Tasks.Task<StoreClient.StoreService.Product[]> GetInventoryAsync(int userId) {
            return base.Channel.GetInventoryAsync(userId);
        }
    }
}