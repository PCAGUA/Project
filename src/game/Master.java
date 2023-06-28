
package Game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Master extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Ventana.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("TRAIN THE MEMORY OF CHILDREN");
        stage.setScene(scene);
        stage.show();
    }
    
         

  }
    