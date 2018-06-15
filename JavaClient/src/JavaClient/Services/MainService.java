package JavaClient.Services;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.datacontract.schemas._2004._07.storeserverlibrary.*;
import org.tempuri.GetProducts;
import org.tempuri.IStoreService;
import com.microsoft.schemas._2003._10.serialization.*;

import JavaClient.Models.Account;
import JavaClient.Models.Product;
import org.tempuri.StoreService;

import java.util.ArrayList;
import java.util.List;

public class MainService {

    private static int id;
    private static boolean shopping = true;
    private static boolean loggedIn = false;
    private static UserDTO user;

    public static ArrayList<Account> acList = new ArrayList<>();
    public static ArrayList<Product> pdList = new ArrayList<>();

    IStoreService proxy = new StoreService().getBasicHttpBindingIStoreService();


    public void OpenConnection(){
        System.out.println("Opened Connection");
        //proxy = new StoreService().getBasicHttpBindingIStoreService();
        shopping = true;
    }

    public void Register(String username){
        System.out.println("Registering user");
        UserDTO newUser = proxy.register(username);
        String status = "failed";
        if(newUser != null){
            status = "succes";
        }
        System.out.println(status + "\n");
        System.out.println(String.format("Password: %s", newUser.getPassword().getValue().toString()));
    }

    public boolean Login(String username, String password) {
        UserDTO newUser = proxy.login(username, password);
        System.out.println("\nChecking your credentials");
        if (newUser != null) {
            System.out.println("You succesfully logged in.\n");
            loggedIn = true;
            user = newUser;
        }
        return loggedIn;
    }

    public ObservableList<String> GetProducts(){
        System.out.println("All of our products\n");
        ArrayOfProductDTO InvArray = proxy.getProducts();
        ObservableList<String> outputList = FXCollections.observableArrayList();
        for(ProductDTO p : InvArray.getProductDTO()){
            outputList.add("Name: " + p.getName().getValue() + " Stock: " + p.getStock() +" Price: "+ p.getPrice());
        }
        return outputList;
    }

    public void BuyProduct(int index, int amount){
        System.out.println("Buy a product.");
        boolean status = proxy.buyProduct(user, ((int) proxy.getProducts().getProductDTO().get(index).getId().longValue()),amount);
        System.out.println(status ? "Purchase Succesful" : "Purchase Failed");
    }

    public ObservableList<String> GetInventory(){
        System.out.println("All your products.\n");
        ArrayOfInventoryDTO uPArray = proxy.getInventory(user);
        ObservableList<String> outputList = FXCollections.observableArrayList();
        for(InventoryDTO p : uPArray.getInventoryDTO()){
            outputList.add("Product: " + p.getProduct().getValue().getName().getValue() + " Amount: " + p.getAmount() +" Total Price: "+ p.getTotalPrice());
        }
        return outputList;
    }

    public float GetBalance(){
        System.out.println("All of your moneys.\n");

        float uBalance = user.getSaldo().floatValue();
        System.out.println("Your Balance: €" + uBalance);
        return uBalance;
    }

    public void LogOut(){
        System.out.println("You logged out :(\n");
        loggedIn = false;
    }

    public void Quit(){
        System.out.println("You left us. :(");
        shopping = false;
    }

}
