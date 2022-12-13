package lk.ijse.teafactory.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane pane;
    public Label lglLogin;
    public Button btnLogin;
    public PasswordField txtPassword;
    public TextField txtUserName;
    public Label lblPassword;
    public Label lblUserName;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane load = FXMLLoader.load(getClass().getResource("../view/AdminDashboardForm.fxml"));
        pane.getChildren().setAll(load);


    }
}
