package lk.ijse.teafactory.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
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

        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        if (userName.equals("")) {
            if (password.equals("")) {
                AnchorPane load = FXMLLoader.load(getClass().getResource("../view/AdminDashboardForm.fxml"));
                pane.getChildren().setAll(load);
            } else {
                new Alert(Alert.AlertType.WARNING, "Wrong Password").show();
            }
        } else if (!userName.equals("") && !password.equals("")) {
            new Alert(Alert.AlertType.WARNING, "Wrong UserName & Password \b\b Check Again!..").show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Wrong UserName ").show();
        }
    }
}
