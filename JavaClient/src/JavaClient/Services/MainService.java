package JavaClient.Services;

//import org.datacontract.schemas._2004._07.ShopServerLibrary.*;
//import org.tempuri.IShopServiceProxy;

import JavaClient.Models.Account;
import JavaClient.Models.Product;

import java.util.ArrayList;

public class MainService {

    private static int id;
    private static boolean shopping = false;
    private static boolean loggedIn = false;

    public static ArrayList<Account> acList = new ArrayList<>();
    public static ArrayList<Product> pdList = new ArrayList<>();

    //IShopServiceProxy proxy;

    public void OpenConnection(){
        System.out.println("Opened Connection");
        //proxy = new IShopServiceProxy();
        shopping = true;
    }

    public void Register(String username, String password){
        System.out.println("Registering user");
        //String register = proxy.register(username);
        //System.out.println(register + "\n");
        System.out.println(String.format("Username: %s \n" +
                "Password: %s", username, password));
    }

    public boolean Login(String username, String password) {
        System.out.println("U are now logging in.");
        System.out.println("\nChecking your credentials");
        int login; // = proxy.login(username, password);
        login = 1;
        if (login != 0) {
            id = login;
            System.out.println("You succesfully logged in.\n");
            loggedIn = true;
        }
        return loggedIn;
    }

    public ArrayList<Product> GetProducts(){
        System.out.println("All of our products\n");
        //Product[] pArray = proxy.getAllProducts();
        return pdList;
    }

    public void BuyProduct(){
        System.out.println("Buy a product.");
        //int pID = Integer.parseInt(pId);
        //String msg = proxy.buyProduct(id, pID, 1);
        //System.out.println(msg);
    }

    public void GetInventory(){
        System.out.println("All your products.\n");
        //Product[] uPArray = proxy.getBoughtProducts(id);
        for(Product p : pdList){
            System.out.println("Product: " + p.getName() + " aantal: " + p.getAmount());
        }
    }

    public double GetBalance(){
        System.out.println("All of your moneys.\n");
        //User u = proxy.findUser(id);

        //double uBalance = u.getBalance();
        //System.out.println("Your Balance: €" + uBalance);
        //return uBalance;
        return 0;
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
