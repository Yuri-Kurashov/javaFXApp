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
       /* assert loginTextView != null : "fx:id=\"loginTextView\" was not injected: check your FXML file 'sample.fxml'.";
        assert passswordTextView != null : "fx:id=\"passswordTextView\" was not injected: check your FXML file 'sample.fxml'.";
        assert authSignInButton != null : "fx:id=\"authSignInButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert loginSignUpButton != null : "fx:id=\"loginSignUpButton\" was not injected: check your FXML file 'sample.fxml'.";
*/
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
}
