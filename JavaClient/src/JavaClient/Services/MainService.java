package JavaClient.Services;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.datacontract.schemas._2004._07.storeserverlibrary.*;
import org.tempuri.IStoreService;
import org.tempuri.StoreService;

public class MainService {

    private static boolean loggedIn = false;
    private static UserDTO user;

    IStoreService proxy = new StoreService().getBasicHttpBindingIStoreService();


    public void OpenConnection() {
        System.out.println("Opened Connection");
    }

    public void Register(String username) {
        System.out.println("Registering user");
        UserDTO newUser = proxy.register(username);
        String status = "failed";
        if (newUser != null) {
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

    public ObservableList<String> GetProducts() {
        System.out.println("All of our products\n");
        ArrayOfProductDTO InvArray = proxy.getProducts();
        ObservableList<String> outputList = FXCollections.observableArrayList();
        for (ProductDTO p : InvArray.getProductDTO()) {
            outputList.add("Name: " + p.getName().getValue() + " Stock: " + p.getStock() + " Price: " + p.getPrice());
        }
        return outputList;
    }

    public void BuyProduct(int index, int amount) {
        System.out.println("Buy a product.");
        boolean status = proxy.buyProduct(user, ((int) proxy.getProducts().getProductDTO().get(index).getId().longValue()), amount);
        System.out.println(status ? "Purchase Succesful" : "Purchase Failed");
        if (status) {
            user = proxy.findUser(user.getId().intValue());
        }
    }

    public ObservableList<String> GetInventory() {
        System.out.println("All your products.\n");
        ArrayOfInventoryDTO uPArray = proxy.getInventory(user);
        ObservableList<String> outputList = FXCollections.observableArrayList();
        for (InventoryDTO p : uPArray.getInventoryDTO()) {
            outputList.add("Product: " + p.getProduct().getValue().getName().getValue() + " Amount: " + p.getAmount() + " Total Price: " + p.getTotalPrice());
        }
        return outputList;
    }

    public float GetBalance() {
        System.out.println("All of your moneys.\n");

        float uBalance = user.getSaldo().floatValue();
        System.out.println("Your Balance: €" + uBalance);
        return uBalance;
    }

}
