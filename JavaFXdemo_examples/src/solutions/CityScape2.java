package solutions;

import java.io.File;
import java.io.FileNotFoundException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CityScape2 extends Application {

	boolean textOn = true;
	String signText = "Clone Central Inc.\nHave us make you a new friend today!";

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException, Exception {
		// Create a pane to hold the image views
		Pane mp01 = new Pane();
		mp01.setPadding(new Insets(5, 5, 5, 5));

		//File sampleImageFile1 = new File("cybercitygraphic.png");
		File sampleImageFile1 = new File("citygraphic.jpg");
		String sampleImageFile1_locationString = sampleImageFile1.toURI().toURL().toExternalForm(); // the Image
																									// constructor needs
																									// an absolute path.
		System.out.println(sampleImageFile1_locationString);
		Image cityScape = new Image(sampleImageFile1_locationString, false); // false => does not load in background,// loads immediately
		
		ImageView cityView = new ImageView(cityScape);
		cityView.setFitHeight(600);
		cityView.setPreserveRatio(true);

		Pane mp02 = new Pane();

		Label lb01 = new Label(signText);
		lb01.setLayoutX(530); // <- works with VBox
		lb01.setLayoutY(120);
		lb01.setMinSize(290, 42);
		lb01.setStyle(
				"-fx-background-color:orange; -fx-font: 16 arial; -fx-font-weight: bold; -fx-text-alignment: center; -fx-border-radius: 10 10 0 0; -fx-background-radius: 10 10 0 0;");

		// Create an animation for moving the ball
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
			if (textOn) {
				textOn = false;
				lb01.setText("");
			} else {
				textOn = true;
				lb01.setText(signText);
			}
		}));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play(); // Start animation

		// assembly area
		mp01.getChildren().add(cityView);
		mp01.getChildren().add(lb01);

		// Create a scene and place it in the stage
		Scene scene = new Scene(mp01);
		primaryStage.setTitle("Cyber City"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.setX(6000); // ###*** POISON SETTING - make sure to disable!!! ***### start location on
									// desktop.
		primaryStage.setY(80); // ###*** POISON SETTING - make sure to disable!!! ***### start location on
								// desktop.
		primaryStage.show(); // Display the stage

	}

//--------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}
