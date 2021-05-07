package solutions.eightball;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JustShowBall extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		
		MagicEightBall eball = new MagicEightBall();
		
		Scene sc = new Scene(eball);
		primaryStage.setScene(sc);
		primaryStage.show();	
	}

	
	// -----------------------------------------------
	public static void main(String[] args) {
		Application.launch(args);
	}

}
