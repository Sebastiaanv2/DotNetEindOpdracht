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
    public TextField amountField;
    MainService ms = new MainService();

    public void OnRefreshButton() {
        BalanceField.setText("€ "+String.valueOf(ms.GetBalance()));

        FillProductList(ms.GetProducts());

        FillInventoryList(ms.GetInventory());
    }

    public void OnBuyButton() {
        String item = ProductList.getSelectionModel().getSelectedItem().toString();
        int amount = Integer.valueOf(amountField.getText());
        int i=0;
        for(String s : ms.GetProducts()){
            if(s.equals(item)){
                break;
            }
            i++;
        }
        ms.BuyProduct(i,amount);
        this.OnRefreshButton();
        System.out.println(String.format("item %S , amount %S",item,amount));
    }

    public void FillProductList(ObservableList<String> list){
        ProductList.setItems((ObservableList) list);
    }

    public void FillInventoryList(ObservableList<String> list){
        InventoryList.setItems((ObservableList) list);
    }

}
