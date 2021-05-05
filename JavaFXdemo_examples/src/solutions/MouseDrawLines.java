package solutions;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MouseDrawLines extends Application {
	
    double startX = 0;
    double startY = 0;
    double endX = 0;
    double endY = 0;
    
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    Pane pane = new Pane();
    Text text = new Text(20, 20, "Programming is fun");
    pane.getChildren().addAll();
 
    
    pane.setOnMousePressed(e -> {
        startX = e.getX();
        startY = e.getY();
        System.out.println(String.valueOf(startX) + "  " +   String.valueOf(startY));
        
    });
    
    pane.setOnMouseReleased(e -> {
        endX = e.getX();
        endY = e.getY();
        System.out.println(String.valueOf(endX) + "  " +   String.valueOf(endY));
        pane.getChildren().add(new Line(startX, startY, endX, endY));
    });
    
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 600, 600);
	primaryStage.setX(7400);  // start location on desktop.
	primaryStage.setY(100);
    primaryStage.setTitle("MouseEventDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public static void drawLine() {
	  
  }
  
 //-----------------------------------------------------
  public static void main(String[] args) {
    launch(args);
  }
} 


