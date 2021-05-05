package solutions.eightball2;

import java.io.File;
import java.net.MalformedURLException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class MagicEightBall2 extends StackPane {

	Circle circle = new Circle(90); 
	WiseSayings wisay = new WiseSayings();
	Label albl = new Label("O_O");
	Polygon tring1 = new Polygon(0,-70, 70, 50, -70, 50); 
	Polygon tring2 = new Polygon(0,-70, 70, 50, -70, 50); 
	String saythis = "";
	double alpha = 0.0;
	Timeline animation;
	int windowR = 20, windowG = 20, windowB = 20;
	  
	public MagicEightBall2() throws Exception {
		
		File sampleImageFile1 = new File("MagicAnswerBall-trimed.jpg");
		
		String sampleImageFile1_locationString = sampleImageFile1.toURI().toURL().toExternalForm(); // the Image constructor needs an absolute path.

		Image backgroundImage = new Image(sampleImageFile1_locationString, false); //false => does not load in background, loads immediately
		ImageView catView = new ImageView(backgroundImage);
		
		getChildren().add(catView);
		
		tring1.setTranslateX(10);
		tring1.setTranslateY(-10);
		tring1.setFill(Color.DARKBLUE);
		tring1.setRotate(180); 
		
		tring2.setTranslateX(10);
		tring2.setTranslateY(-10);
		tring2.setFill(Color.rgb(0, 0, 0, 0.0));
		tring2.setRotate(180); 
		
		circle.setTranslateX(10);
		circle.setTranslateY(-20);	
	    circle.setFill(Color.rgb(windowR, windowG, windowB, 1.0));
	    circle.setStroke(Color.rgb(0, 0, 0, 0.0));


		saythis = wisay.getRandomSaying();
		
		albl.setTranslateX(10);
		albl.setTranslateY(-30);
		albl.setText(saythis);
		albl.setTextFill(Color.WHITE);
		
	    //getChildren().add(circle);
	    getChildren().add(tring1);
	    getChildren().add(albl);
	    getChildren().add(circle);
	}
	
	public void fadeDownWindow() {
		animation = new Timeline(new KeyFrame(Duration.millis(100), e -> {
			circle.setFill(Color.rgb(windowR, windowG, windowB, alpha));
			if(alpha < 0.98999) {
				alpha += 0.01;
			} else {
				animation.stop();
			}
		}));
		animation.setCycleCount(100);
		animation.play(); // Start animation
	}
	
	public void fadeUpWindow() {
		alpha = 1.0;
		animation = new Timeline(new KeyFrame(Duration.millis(50), e -> {
			circle.setFill(Color.rgb(windowR, windowG, windowB, alpha));
			if(alpha > 0.011) {
				alpha -= 0.01;
			} else {
				animation.stop();
				fadeDownWindow();
			}
		}));
		animation.setCycleCount(100);
		animation.play(); // Start animation
	}
	
	public void showSaying() {
		String saythis = wisay.getRandomSaying();
		albl.setText(saythis);
	}
	
}
