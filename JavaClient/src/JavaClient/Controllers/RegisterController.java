package JavaClient.Controllers;

import JavaClient.Services.MainService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RegisterController {

    public TextField UsernameField;
    MainService ms = new MainService();

    @FXML
    void OnRegisterButton() {
        ms.Register(UsernameField.getText());
    }

}
