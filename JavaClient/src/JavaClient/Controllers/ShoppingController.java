package JavaClient.Controllers;

import JavaClient.Models.Product;
import JavaClient.Services.MainService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import static JavaClient.Services.MainService.pdList;

public class ShoppingController {

    public Label BalanceField;
    public ListView ProductList;
    public ListView InventoryList;
    MainService ms = new MainService();

    public void OnRefreshButton(ActionEvent actionEvent) {
        ObservableList<String> productList = FXCollections.observableArrayList();
        for (Product p : ms.GetProducts()) {
            productList.add(" "+ p.getId() + " " + p.getName() + " "
                    + p.getPrice() + " " + p.getAmount());
        }
        FillProductList(productList);
    }

    public void OnBuyButton(ActionEvent actionEvent) {
        System.out.println(ProductList.getSelectionModel().getSelectedItem());
        ms.BuyProduct();
    }

    public void FillProductList(ObservableList<String> list){
        ProductList.setItems((ObservableList) list);
    }

}
