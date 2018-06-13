package JavaClient;

import JavaClient.Models.Account;
import JavaClient.Models.Product;
import JavaClient.Services.MainService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Views/LoginView.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 315, 164));
        primaryStage.show();
    }

    public static void main(String[] args) {

        Account ac1 = new Account("Henk");
        ac1.setPassword();

        Account ac2 = new Account("Freek");
        ac2.setPassword();

        MainService.acList.add(ac1);
        MainService.acList.add(ac2);

        Product pr1 = new Product("banaan",5,1.20);
        Product pr2 = new Product("aardbei",8,3.50);
        pr1.setId(1);
        pr2.setId(2);

        MainService.pdList.add(pr1);
        MainService.pdList.add(pr2);

        launch(args);
    }
}
