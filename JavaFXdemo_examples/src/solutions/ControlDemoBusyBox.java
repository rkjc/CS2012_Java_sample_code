package solutions;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlDemoBusyBox extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage theStage) {
		// Create a circle and set its properties
		BusyBoxShapes shps = new BusyBoxShapes();
		Circle c1 = shps.getCircle1();
		Circle c2 = shps.getCircle2();
		Circle c3 = shps.getCircle3();
		
		
		Label lb01 = new Label("Group 1");
		lb01.setLayoutX(20);
		lb01.setLayoutY(10);
		
		Label lb02 = new Label("radio result");
		lb02.setLayoutX(50);
		lb02.setLayoutY(10);
//
//		RadioButton rb01 = new RadioButton();
//		RadioButton rb02 = new RadioButton();
//		RadioButton rb03 = new RadioButton();
		
		//BorderPane bp01 = new BorderPane();
		Pane bp01 = new Pane();
		
		   VBox paneForRadioButtons = new VBox(20);
		    paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5)); 
		    paneForRadioButtons.setStyle("-fx-border-color: green");
		    paneForRadioButtons.setStyle
		      ("-fx-border-width: 2px; -fx-border-color: green");
		    RadioButton rbRed = new RadioButton("Red");
		    RadioButton rbGreen = new RadioButton("Green");
		    RadioButton rbBlue = new RadioButton("Blue");
		    paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
		    //bp01.setRight(paneForRadioButtons);

		    ToggleGroup group = new ToggleGroup();
		    rbRed.setToggleGroup(group);
		    rbGreen.setToggleGroup(group);
		    rbBlue.setToggleGroup(group);
		    
		    rbRed.setOnAction(e -> {
		      if (rbRed.isSelected()) {
		    	 System.out.println("rbRed");
		      }
		    });
		    
		    rbGreen.setOnAction(e -> {
		      if (rbGreen.isSelected()) {
		    	  System.out.println("rbGreen");
		      }
		    });

		    rbBlue.setOnAction(e -> {
		      if (rbBlue.isSelected()) {
		    	  System.out.println("rbRBlue");
		      }
		    });
		
	// -------------------------------------------------------------
		Pane mypane = new Pane();
		// Pane mypane = new StackPane();
		mypane.setMinSize(200, 200);
		mypane.setPadding(new Insets(10, 10, 10, 10));
		mypane.setStyle("-fx-background-color: CYAN; -fx-border-color: orange; -fx-border-width: 2; ");

		Pane mypane2 = new Pane();
		mypane2.setMinSize(100, 100);
		mypane2.setLayoutX(20);
		mypane2.setLayoutY(30);
		mypane2.setStyle("-fx-background-color: darkcyan; -fx-border-color: darkred; -fx-border-width: 2; ");

		// Color.CORNSILK

		StackPane sp01 = new StackPane();
		sp01.setMinSize(50, 50);
		sp01.setStyle("-fx-background-color: CORNSILK; -fx-border-color: grey; -fx-border-width: 2; ");
		Pane sp02 = new StackPane();
		// mp02.setAlignment(Pos.CENTER);
		sp02.setMinSize(50, 50);
		// mp02.setMaxSize(50, 50);
		sp02.setStyle("-fx-background-color: yellow; -fx-border-color: grey; -fx-border-width: 2; ");

		Pane mp03 = new Pane();
		mp03.setMinSize(50, 50);
		mp03.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");

		Pane mp04 = new Pane();
		mp04.setMinSize(50, 50);
		mp04.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");

		Pane mp05 = new Pane();
		mp05.setMinSize(50, 50);
		mp05.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");

		// Create a pane and set its properties
		GridPane gPane = new GridPane();

		// gPane.setAlignment(Pos.BASELINE_RIGHT);
		gPane.setAlignment(Pos.CENTER);
		gPane.setPadding(new Insets(10, 10, 10, 10));
		gPane.setHgap(5);
		gPane.setVgap(5);
		gPane.setLayoutX(30);
		gPane.setLayoutY(10);
		// gPane.setMaxHeight(100);
		gPane.setMinHeight(10);
		// gPane.setMaxWidth(100);
		gPane.setMinWidth(100);
		gPane.setStyle("-fx-background-color: cyan; -fx-border-color: red; -fx-border-width: 3; ");


		HBox hb01 = new HBox();
		hb01.setStyle("-fx-background-color: lightgreen; -fx-border-color: olive; -fx-border-width: 2; ");
		hb01.setMinSize(150, 50);
		hb01.setMaxSize(150, 50);
		hb01.setLayoutX(180);
		hb01.setLayoutY(220);
		StackPane.setAlignment(hb01, Pos.BOTTOM_CENTER);

		HBox hb02 = new HBox();
		hb02.setStyle("-fx-background-color: lightgreen; -fx-border-color: olive; -fx-border-width: 2; ");
		hb02.setMinSize(320, 40);

		VBox vb01 = new VBox(30);
		vb01.setLayoutX(15);
		vb01.setLayoutY(5);
		vb01.setStyle("-fx-background-color: pink; -fx-border-color: violet; -fx-border-width: 3; ");
		vb01.setAlignment(Pos.BOTTOM_RIGHT);
		
		VBox vb02 = new VBox(30);
		vb02.setLayoutX(500);
		vb02.setLayoutY(150);
		vb02.setMinSize(20, 70);
		vb02.setStyle("-fx-background-color: green; -fx-border-color: darkgreen; -fx-border-width: 3; ");
		vb02.setAlignment(Pos.BOTTOM_RIGHT);

		// =======================================================================
		

//		mypane.getChildren().add(lb01);
//		mypane.getChildren().add(mypane2);
		mypane.getChildren().add(bp01);
		
//		mypane2.getChildren().add(lb01);
//		mypane2.getChildren().add(hb01);
		// mypane2.getChildren().add(mycircle3);
		
//		vb01.getChildren().add(mypane2);
//		vb01.getChildren().add(hb02);
//		vb01.getChildren().add(mycircle3);

//		sp02.getChildren().add(mycircle);

//		gPane.add(sp02, 0, 0);
//		// gPane.add(mycircle, 0, 0);
//		gPane.add(mycircle2, 3, 2);
//		gPane.add(sp01, 2, 1);
//		gPane.add(mp03, 3, 2);
//		gPane.add(mp04, 2, 2);
//		gPane.add(mp05, 1, 2);

		// Create a scene and place it in the stage
		// Scene scene = new Scene(mypane, 400, 400);
		Scene scene = new Scene(mypane);
		theStage.setTitle("Layout of Layouts"); // Set the stage title
		theStage.setScene(scene); // Place the scene in the stage
		theStage.setX(7400); // start location on desktop.
		theStage.setY(80);
		theStage.show(); // Display the stage
	}

	Color[] myBling = { Color.RED, Color.BLUE, Color.ORANGE, Color.AQUA, Color.VIOLET, Color.DARKCYAN, Color.DARKRED,
			Color.OLIVE, Color.PINK, Color.TURQUOISE, Color.BURLYWOOD, Color.YELLOW, Color.GREEN, Color.GREY };

	// --------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}
