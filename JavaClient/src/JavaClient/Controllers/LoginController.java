package JavaClient.Controllers;

import JavaClient.Services.MainService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    MainService ms = new MainService();
    public TextField UsernameField;
    public javafx.scene.control.PasswordField PasswordField;

    @FXML
    void OnLoginButtonPressed(){

        String username = UsernameField.getText();
        String password = PasswordField.getText();

        System.out.println("login button pressed");
        System.out.println(String.format("Username: %s \n" +
                "Password: %s", username, password));

        if(ms.Login(username,password)){
                System.out.println("register button pressed");
                try{
                    Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("JavaClient/Views/ShoppingView.fxml"));
                    Stage consoleStage = new Stage();
                    consoleStage.setTitle("Shopping");
                    consoleStage.setScene(new Scene(root1));
                    consoleStage.show();
                    consoleStage.setResizable(false);
                    consoleStage.sizeToScene();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
    }

    @FXML
    void OnRegisterButton(){
        System.out.println("register button pressed");
        try{
            Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("JavaClient/Views/RegisterView.fxml"));
            Stage consoleStage = new Stage();
            consoleStage.setTitle("Register");
            consoleStage.setScene(new Scene(root1));
            consoleStage.show();
            consoleStage.setResizable(false);
            consoleStage.sizeToScene();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

