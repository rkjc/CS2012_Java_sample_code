package media;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class SimplePlayMedia extends Application {

	@Override
	public void start(Stage theStage) throws Exception {

		String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem1.mp3";
		Media media = new Media(MEDIA_URL);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		MediaView mediaView = new MediaView(mediaPlayer);

		mediaPlayer.play();

//		BorderPane bpane = new BorderPane();
//		bpane.setCenter(mediaView);
//
//		Scene scene = new Scene(bpane, 300, 200);
//		theStage.setTitle("Layout of Layouts"); // Set the stage title
//		theStage.setScene(scene); // Place the scene in the stage
//		theStage.setX(7400); // start location on desktop.
//		theStage.setY(80);
		theStage.show(); // Display the stage

	}

	// ------------------------------------------------------
	public static void main(String[] args) {
		Application.launch(args);
	}
}
