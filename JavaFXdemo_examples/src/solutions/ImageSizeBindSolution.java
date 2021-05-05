package solutions;

import java.io.File;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImageSizeBindSolution extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException, Exception {
		double winHeight = 100;
		double winWidth = 100;
		double winRatio = 1.0;
		
		// Create a pane to hold the image views
		Pane hPane = new HBox(10);
		hPane.setPadding(new Insets(5, 5, 5, 5));

		File fileImg1 = new File("images/HoverBike.jpg"); // in default Eclipse file location
		String strImgLoc1 = fileImg1.toURI().toURL().toExternalForm(); // Produces the absolute path the Image //
																		// constructor needs
		Image image1 = new Image(strImgLoc1);
		
		double imgHeight = image1.getHeight();
		double imgWidth = image1.getWidth();
		winRatio = imgHeight / imgWidth;
		
		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitHeight(600);
		imageView1.setPreserveRatio(true);
		
		//imageView1.fitHeightProperty().bind(hPane.heightProperty());
		
		hPane.getChildren().add(imageView1);

		// Create a scene and place it in the stage
		winHeight = 800;
		winWidth = winHeight / winRatio;
		Scene scene = new Scene(hPane, winWidth, winHeight);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

//----------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}
