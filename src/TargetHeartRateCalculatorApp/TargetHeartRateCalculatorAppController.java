package TargetHeartRateCalculatorApp;



import javax.swing.text.TabableView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;

public class TargetHeartRateCalculatorAppController {
	
	@FXML private ImageView imageView;
	
	@FXML private Label TitleLabel;
	@FXML private Label MyAgeLabel;
	
	@FXML private TextField MyAgeTextField;
	
	@FXML private RadioButton MaleRadioButton;
	@FXML private RadioButton FemaleRadioButton;
	
	
	@FXML private Button CalculateButton;
	
	@FXML private TabableView TableView;
	
	@FXML private GridPane GridPane;
	
	
	
	final ToggleGroup group = new ToggleGroup();
	//FemaleRadioButton.setToggleGroup(group);
	//MaleRadioButton.setToggleGroup(group);
	
	
public void ChangeBackgroundColorPinkHandler(ActionEvent event){

	try{
	GridPane.setStyle("-fx-background: #ffcccc;");
	
} catch (Exception exception) {
	System.err.println("Invalid Input: " + exception);
   } 
	
	}
	
	public void ChangeBackgroundColorBlueHandler(ActionEvent event){
		try{
		GridPane.setStyle("-fx-background: #b3d9ff;");
	} catch (Exception exception) {
		System.err.println("Invalid Input: " + exception);
	   } 
	}

	
}
