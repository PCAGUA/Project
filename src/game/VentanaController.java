/**
 * Sample Skeleton for 'Ventana.fxml' Controller Class
 */

package game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VentanaController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btInicio"
    private Button btInicio; // Value injected by FXMLLoader

    @FXML // fx:id="tfedad"
    private TextField tfedad; // Value injected by FXMLLoader

    @FXML // fx:id="tfnombre"
    private TextField tfnombre; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btInicio != null : "fx:id=\"btInicio\" was not injected: check your FXML file 'Ventana.fxml'.";
        assert tfedad != null : "fx:id=\"tfedad\" was not injected: check your FXML file 'Ventana.fxml'.";
        assert tfnombre != null : "fx:id=\"tfnombre\" was not injected: check your FXML file 'Ventana.fxml'.";

    }

}
