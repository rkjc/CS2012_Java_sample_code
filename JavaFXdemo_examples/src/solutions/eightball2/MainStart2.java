package solutions.eightball2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainStart2 extends Application {

	@Override
	public void start(Stage myStage) throws Exception {

		BorderPane bpane = new BorderPane();
		MagicEightBall2 mball = new MagicEightBall2();
		Button askQuest = new Button("ask Question");
		BorderPane.setAlignment(askQuest, Pos.CENTER);

		
		askQuest.setOnAction(abc -> {
			mball.showSaying();
		});
			
		mball.setOnMouseClicked(abc -> {
			mball.showSaying();
		});

		bpane.setCenter(mball);
		bpane.setBottom(askQuest);

		Scene sc = new Scene(bpane);
		myStage.setScene(sc);
		myStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
