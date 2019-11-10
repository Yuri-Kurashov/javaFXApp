package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginTextView;

    @FXML
    private PasswordField passwordTextView;

    @FXML
    private Button authSignInButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    void initialize() {

        authSignInButton.setOnAction(actionEvent -> {
            String loginText = loginTextView.getText().trim();
            String loginPassword =passwordTextView.getText().trim();
            if(!loginText.equals("") && !loginPassword.equals("")) {
                loginUser(loginText, loginPassword); 
            } else {
                System.out.println("Login or Password is empty");
            }
        });

        loginSignUpButton.setOnAction(actionEvent -> {
           loginSignUpButton.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/sample/signUp.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();


        });
    }

    private void loginUser(String loginText, String loginPassword) {
    }
}
