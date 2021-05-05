package solutions;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClockAnimationVariable extends Application {
	
	long stepIncrement = 10;
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		ClockPaneVariable clock = new ClockPaneVariable(); // Create a clock

		// Create a handler for animation
		EventHandler<ActionEvent> cartoonHandler = e -> {
			// clock.setCurrentTime(); // Set a new clock time (standard clock use)
			clock.incrementTime(stepIncrement);  // for variable clock use
		};
	
		// Create an animation for a running clock
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(10), cartoonHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play(); // Start animation
		
		clock.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP) {
				stepIncrement += 5;
			} else if (e.getCode() == KeyCode.DOWN) {
				stepIncrement -= 5;
			}
			System.out.println(stepIncrement);
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(clock, 400, 300);
		primaryStage.setTitle("BounceBallControl"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.setX(7400); // start location on desktop.
		primaryStage.setY(60);
		primaryStage.show(); // Display the stage

		// Must request focus after the primary stage is displayed
		clock.requestFocus();
	}

// --------------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}