
package Projec1;

import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Inicial extends Application {


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
public class Inicial extends Application {
    private static final int MAX_NUMBER = 10; // El rango máximo para los números en las preguntas

    private Label questionLabel;
    private TextField answerField;
    private Button submitButton;
    private Label resultLabel;

    private Random random;
    private int firstNumber;
    private int secondNumber;

    @Override
    public void start(Stage primaryStage) {
        random = new Random();

        questionLabel = new Label();
        answerField = new TextField();
        submitButton = new Button("Enviar");
        resultLabel = new Label();

        submitButton.setOnAction(e -> checkAnswer());

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(questionLabel, answerField, submitButton, resultLabel);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("TRAIN THE MEMORY OF CHILDREN");
        primaryStage.setScene(scene);
        primaryStage.show();

        generateQuestion();
    }

    private void generateQuestion() {
        firstNumber = random.nextInt(MAX_NUMBER + 1);
        secondNumber = random.nextInt(MAX_NUMBER + 1);

        questionLabel.setText("¿Cuánto es " + firstNumber + " + " + secondNumber + "?");
        answerField.clear();
        resultLabel.setText("");
    }

    private void checkAnswer() {
        try {
            int userAnswer = Integer.parseInt(answerField.getText());
            int correctAnswer = firstNumber + secondNumber;

            if (userAnswer == correctAnswer) {
                resultLabel.setText("¡Respuesta correcta!");
            } else {
                resultLabel.setText("Respuesta incorrecta. La respuesta correcta es: " + correctAnswer);
            }

            generateQuestion();
        } catch (NumberFormatException e) {
            resultLabel.setText("Ingrese un número válido.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}    
       

  }
