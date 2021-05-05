package solutions;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MovingCircle extends Application {

    Integer xPos = 100;
    Integer yPos = 100;
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		   // Create a circle and set its properties
	    Circle mycircle = new Circle();    		
	    mycircle.setCenterX(xPos);
	    mycircle.setCenterY(yPos);
	    mycircle.setRadius(50);
	    mycircle.setStroke(Color.BLACK);
	    mycircle.setFill( Color.color(0.7, 0.25, 0.8) );
	    
		Button btnLeft = new Button("left");
		btnLeft.setMaxWidth(Double.MAX_VALUE);
		//btnLeft.setRotate(90);
		Button btnRight = new Button("right");
		btnRight.setMaxWidth(Double.MAX_VALUE);
		btnRight.setRotate(-90);
		Button btnDown = new Button("down");
		btnDown.setMaxWidth(Double.MAX_VALUE);
		Button btnUp = new Button("up");
		btnUp.setMaxWidth(Double.MAX_VALUE);
		
		
		
		btnLeft.setOnAction( xyz -> {
			xPos -= 4;
			mycircle.setCenterX(xPos);
			mycircle.setCenterY(yPos);
			System.out.println("moved");
			System.out.println(xyz.getSource().toString());	
		} );
		
		btnRight.setOnAction( xyz -> {
			xPos += 4;
			mycircle.setCenterX(xPos);
			mycircle.setCenterY(yPos);
			System.out.println("moved");
			System.out.println(xyz.getSource().toString());	
		} );
		
		btnUp.setOnAction( xyz -> {
			yPos -= 4;
			mycircle.setCenterX(xPos);
			mycircle.setCenterY(yPos);
			System.out.println("moved");
			System.out.println(xyz.getSource().toString());	
		} );
		
		btnDown.setOnAction( xyz -> {
			yPos += 4;
			mycircle.setCenterX(xPos);
			mycircle.setCenterY(yPos);
			System.out.println("moved");
			System.out.println(xyz.getSource().toString());	
		} );
	    
		HBox hbox1 = new HBox(10); // the attribute sets the space between nodes
		//hbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		hbox1.setStyle("-fx-background-color: CYAN");
		hbox1.setStyle("-fx-maxWidth: Infinity");
		hbox1.setAlignment(Pos.CENTER);  //?? this does work
		hbox1.getChildren().add(btnLeft);

		
		BorderPane bPane = new BorderPane();
		//bPane.setAlignment(btnLeft, Pos.CENTER_LEFT);
		bPane.setAlignment(hbox1, Pos.CENTER_LEFT);
		bPane.setAlignment(btnRight, Pos.CENTER_RIGHT);
		bPane.setAlignment(btnUp, Pos.CENTER);
		bPane.setAlignment(btnDown, Pos.CENTER);
		

		
		Pane pane = new Pane();
		pane.getChildren().add(mycircle);
		
		bPane.setCenter(pane);
		bPane.setBottom(btnDown);
		bPane.setTop(btnUp);
		//bPane.setLeft(btnLeft);
		bPane.setLeft(hbox1);
		bPane.setRight(btnRight);
		
	    
	    primaryStage.setTitle("MoveCircle"); // Set the stage title
	    primaryStage.setScene(new Scene(bPane, 600, 600)); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}

	//---------------------------------------------------
	public static void main(String[] args) {
	    launch(args);
	  }
}
