package sample;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class AppController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imageButtonAdvTime;

    @FXML
    void initialize() {
        assert imageButtonAdvTime != null : "fx:id=\"imageButtonAdvTime\" was not injected: check your FXML file 'app.fxml'.";

    }
}
