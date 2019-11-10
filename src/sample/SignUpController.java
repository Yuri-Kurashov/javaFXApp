package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpNameTextView;

    @FXML
    private PasswordField signUpPasswordTextView;

    @FXML
    private TextField signUpLastNameTextView;

    @FXML
    private TextField signUpCountryTextView;

    @FXML
    private TextField signUpLoginTextView;

    @FXML
    private Button signUpRegButton;

    @FXML
    private CheckBox signUpMaleCheckBox;

    @FXML
    private CheckBox signUpFemaleCheckBox;

    @FXML
    void initialize() {
       /* assert signUpNameTextView != null : "fx:id=\"signUpNameTextView\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpPasswordTextView != null : "fx:id=\"signUpPasswordTextView\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpLastNameTextView != null : "fx:id=\"signUpLastNameTextView\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpCountryTextView != null : "fx:id=\"signUpCountryTextView\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpLoginTextView != null : "fx:id=\"signUpLoginTextView\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpRegButton != null : "fx:id=\"signUpRegButton\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpMaleCheckBox != null : "fx:id=\"signUpMaleCheckBox\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpFemaleCheckBox != null : "fx:id=\"signUpFemaleCheckBox\" was not injected: check your FXML file 'signUp.fxml'.";
*/
    }
}
