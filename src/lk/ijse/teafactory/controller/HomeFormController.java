package lk.ijse.teafactory.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HomeFormController {
    public Button btnLogin;
    public Label lblFactoryName;
    public AnchorPane pane;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane load = FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        pane.getChildren().setAll(load);
    }
}
