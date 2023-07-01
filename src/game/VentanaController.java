/**
 * Sample Skeleton for 'Ventana.fxml' Controller Class
 */

package game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VentanaController {
    
    @FXML
    TextField tfnombre;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void inicio(ActionEvent event) throws IOException {  // Accion debe darle click al boton
        
        String username = tfnombre.getText();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Tablero.fxml"));	
		root = loader.load();	
		
		TableroController TableroController = loader.getController();
		TableroController.displayName(username);
		
		//root = FXMLLoader.load(getClass().getResource("Tablero.fxml"));	
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

                
	}

    }