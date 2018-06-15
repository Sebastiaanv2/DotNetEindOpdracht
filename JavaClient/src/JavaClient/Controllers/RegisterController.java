package JavaClient.Controllers;

import JavaClient.Models.Account;
import JavaClient.Services.MainService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RegisterController {

    MainService ms = new MainService();
    public TextField UsernameField;

    @FXML
    void OnRegisterButton(){
        Account ac = new Account(UsernameField.getText());
        ac.setPassword();
        ms.Register(ac.getUsername());    }

}
