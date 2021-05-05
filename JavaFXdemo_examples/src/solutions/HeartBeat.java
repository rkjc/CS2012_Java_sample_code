package solutions;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HeartBeat extends Application {

	double defaultY = 100;
	double peakY = 20;
	double currentX = 0;
	double currentY = defaultY;
	double previousX = 0;
	double previousY = defaultY;
	double frameCount = 0;
	double edgeOfPane = 0;
	double pulseWidth = 10;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane mypane = new Pane();

		// every frame the x position moves to the right a set amount
		// when x position reaches the right side of frame it resets to 0
		// when a pulse happens the y value is decreased for that frame
		// next frame y value is set back to default
		// pulses happen every 6th frame
		// add a button for doing additional pulses every time the button is pressed. 

		// Create a handler for animation
		EventHandler<ActionEvent> actionHappens = e -> {
			frameCount += 1;
			Object obj = e.getSource();
			System.out.println(obj.toString());
			
			if(currentX > (mypane.widthProperty().get())) {
				currentX = 0;
				currentY = defaultY;
				previousX = currentX;
				previousY = currentY;
				frameCount = 0;
				mypane.getChildren().clear();
			}
	
			if(obj instanceof KeyFrame) {
				System.out.println("keyframe");
			}
			
			if(obj instanceof Button) {
				System.out.println("button");
			}
			
//			System.out.println(mypane.widthProperty().get());
			
//			String buttonData = ((Button)obj).getUserData().toString();
//			System.out.println(buttonData);
			
			if (frameCount % 6 == 0 || obj instanceof Button) { //
				currentX += pulseWidth / 2;
				currentY = peakY;
				mypane.getChildren().add(new Line(previousX, previousY, currentX, currentY));
				previousX = currentX;
				previousY = currentY;
				currentX += pulseWidth / 2;
				currentY = defaultY;
				mypane.getChildren().add(new Line(previousX, previousY, currentX, currentY));
			} else {
				currentX += pulseWidth;
				currentY = defaultY;
				mypane.getChildren().add(new Line(previousX, previousY, currentX, currentY));
			}	
			previousX = currentX;
			previousY = currentY;
		}; // Set a new clock time

		// Create an animation for a running clock
		Timeline cartoon = new Timeline(new KeyFrame(Duration.millis(500), actionHappens));

		cartoon.setCycleCount(Timeline.INDEFINITE);
		cartoon.play(); // Start animation

		// adding som buttons to the bottom of the scene
		
		VBox vBox = new VBox(40);
		HBox hBox = new HBox(30);
		
		Button pulse = new Button("pulse");
		pulse.setUserData("pulse");
		pulse.setOnAction(actionHappens);
		
		hBox.getChildren().addAll(pulse);
		vBox.getChildren().addAll(mypane, hBox);
		
		// Create a scene and place it in the stage

		Scene scene = new Scene(vBox, 600, 200);
		primaryStage.setTitle("Heart Beat"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.setX(7200); // start location on desktop.
		primaryStage.setY(60);
		primaryStage.show(); // Display the stage
	}

// ----------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}
