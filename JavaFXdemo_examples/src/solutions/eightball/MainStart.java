package solutions.eightball;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainStart extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Magic Eight Ball");
		BorderPane bpane = new BorderPane();
		
		MagicEightBall eightBall = new MagicEightBall();
		
		HBox hbox1 = new HBox(10); // the attribute sets the space between nodes
		hbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		hbox1.setStyle("-fx-background-color: CYAN");
		hbox1.setAlignment(Pos.CENTER);
		
		Button btn1 = new Button();
		Button btn2 = new Button();
		
		btn1.setText("Ask Question");
		btn1.setOnAction( event ->{
				eightBall.showSaying();
		});

		btn2.setText("Mysterious Fog");
		btn2.setOnAction(event -> {
				eightBall.showMystery();
		});
		
		hbox1.getChildren().add(btn1);
		hbox1.getChildren().add(btn2);
		
		bpane.setCenter(eightBall);
		bpane.setBottom(hbox1);

		Scene sc = new Scene(bpane);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

	
	// -----------------------------------------------
	public static void main(String[] args) {
		Application.launch(args);
	}
}
