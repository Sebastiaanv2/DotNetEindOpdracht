package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    public TextField UsernameField;
    public javafx.scene.control.PasswordField PasswordField;

    @FXML
    void OnLoginButtonPressed(){
        System.out.println("login button pressed");
        System.out.println(String.format("Username: %s \n" +
                "Password: %s", UsernameField.getText(), PasswordField.getText()));

    }

    @FXML
    void OnRegisterButton(){
        System.out.println("register button pressed");
    }


}

