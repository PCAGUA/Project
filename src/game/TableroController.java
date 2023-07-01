/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package game;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TableroController {

	@FXML
	Label lbNombre;
	
	public void displayName(String username) {
		lbNombre.setText("Nombre de Jugador:  " + username);
	}
	
}
