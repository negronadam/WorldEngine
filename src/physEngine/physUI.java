package physEngine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.*;
public class physUI extends Application implements EventHandler<ActionEvent> {

	
	Button button;
	Text text;
	Text text2;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Title of the Window");
		
		button = new Button();
		text = new Text(100, 50, "");
		button.setText("Hello!");
		text.setText("This is a test string!");
		button.setOnAction(this);
		text.relocate(200, 70);
		
		StackPane layout = new StackPane();
		StackPane layout2 = new StackPane();
		layout.getChildren().add(button);
		layout.getChildren().add(text);
		
		Scene scene = new Scene(layout, 300, 400);
		Scene scene2 = new Scene(layout2, 300, 400);
		text2 = new Text(50, 100, "Hello! You have switched stages!");
		layout2.getChildren().add(text2);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public void scene2(Stage stage2) throws Exception
	{
		stage2.setTitle("This is the second stage!");
		text2 = new Text(50, 100, "Hello! You have switched stages!");
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(text2);
		
		
	}
	
	@Override
	
	public void handle(ActionEvent event)
	{
		if(event.getSource() == button)
		{
			
		}
	}

}
