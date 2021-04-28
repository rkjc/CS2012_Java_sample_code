package imageShow;

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

public class ImageExamples_3 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException, Exception {
		// Create a pane to hold the image views
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));

		File sampleImageFile1 = new File("crazyCat.jpg");
		String sampleImageFile1_locationString = sampleImageFile1.toURI().toURL().toExternalForm(); // the Image
			
		
		// constructor needs																							// an absolute path.
		Image catImage = new Image(sampleImageFile1_locationString, false); // false => does not load in background,
																			// loads immediately
		ImageView catView = new ImageView(catImage);
		catView.setFitHeight(300);
		catView.setPreserveRatio(true);
		pane.getChildren().add(catView);

		// --------------------------------------------------------

		File imgFile2 = new File("robotRineo.jpg"); // in default Eclipse file location
		String imgFile2loc = imgFile2.toURI().toURL().toExternalForm(); // the Image constructor needs an absolute path.
		Image file2Image = new Image(imgFile2loc, false); // false => does not load in background, loads immediately
		ImageView file2ImageView = new ImageView(file2Image);
		file2ImageView.setFitHeight(300);
		file2ImageView.setPreserveRatio(true);
		//imageView.fitHeightProperty().bind(mediaView.heightProperty());	
		
		pane.getChildren().add(file2ImageView);

		// -------------------------------------------------------
		// without all the printing clutter
		// using a location in a sub-folder 'images'

		File imgFile3 = new File("images/mouseTeddy.jpg"); // in default Eclipse file location
		String imgFile3loc = imgFile3.toURI().toURL().toExternalForm(); // Produces the absolute path the Image																// constructor needs
		Image file3Image = new Image(imgFile3loc);
		ImageView file3ImageView = new ImageView(file3Image);
		file3ImageView.setFitHeight(300);
		file3ImageView.setPreserveRatio(true);
		pane.getChildren().add(file3ImageView);

		// -------------------------------------------------------
		Image img4img = new Image(new File("images/SpaceSuit.jpg").toURI().toURL().toExternalForm());
		ImageView img4iv = new ImageView(img4img);
		img4iv.setFitHeight(300);
		img4iv.setPreserveRatio(true);
		pane.getChildren().add(img4iv);
		// -------------------------------------------------------

		Image img5img = new Image("https://fanart.tv/fanart/tv/80534/tvposter/happy-tree-friends-569227864b41c.jpg");
		ImageView img5iv = new ImageView(img5img);
		img5iv.setFitHeight(300);
		img5iv.setPreserveRatio(true);
		pane.getChildren().add(img5iv);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}

// ----------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}