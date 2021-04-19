package chapter15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

public class BounceBallControl extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    BallPane ballPane = new BallPane(); // Create a ball pane

    // Pause and resume animation
   // ballPane.setOnMousePressed(e -> ballPane.pause());
    
    
    EventHandler<MouseEvent> handle1 = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent arg0) {
			ballPane.pause();
		}};
	ballPane.setOnMousePressed(handle1);
	
		
    ballPane.setOnMouseReleased(e ->{
    	ballPane.play();
    	System.out.println("mouse released");
    });

    // Increase and decrease animation   
    ballPane.setOnKeyPressed(e -> {
      if (e.getCode() == KeyCode.UP) {
        ballPane.increaseSpeed();
      } 
      else if (e.getCode() == KeyCode.DOWN) {
        ballPane.decreaseSpeed();
      }
    });

    // Create a scene and place it in the stage
    Scene scene = new Scene(ballPane, 400, 300);
    primaryStage.setTitle("BounceBallControl"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    // Must request focus after the primary stage is displayed
    ballPane.requestFocus();
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
