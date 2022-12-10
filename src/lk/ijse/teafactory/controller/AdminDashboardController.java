package lk.ijse.teafactory.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminDashboardController {
    public JFXButton btnCustomers;
    public JFXButton btnStocks;
    public JFXButton btnOrders;
    public JFXButton btnProducts;
    public JFXButton btnSuppliers;
    public JFXButton btnHome;
    public Label lblAdminDashboard;
    public AnchorPane pane;

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HomeForm");
    }

    public void btnSuppliersOnAction(ActionEvent actionEvent) {
    }

    public void btnProductsOnAction(ActionEvent actionEvent) {
    }

    public void btnOrdersOnAction(ActionEvent actionEvent) {
    }

    public void btnStocksOnAction(ActionEvent actionEvent) {
    }

    public void btnCustomersOnAction(ActionEvent actionEvent) {
    }

    public void setUi(String URL) throws IOException {
        AnchorPane pane1 = FXMLLoader.load(getClass().getResource("../view/" + URL + ".fxml"));
        pane.getChildren().setAll(pane1);
    }
}
