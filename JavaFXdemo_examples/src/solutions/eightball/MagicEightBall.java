package solutions.eightball;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MagicEightBall extends StackPane {

	private Label answer = new Label("o_O");

	WiseSayings ws = new WiseSayings();
	
	public MagicEightBall() {	
		answer.setAlignment(Pos.CENTER);
		
		Circle bigCircle = new Circle(120); 
		bigCircle.setFill(Color.rgb(0,0,0));
		bigCircle.setStroke(Color.BLACK);
		bigCircle.setStrokeWidth(4);
		StackPane.setAlignment(bigCircle, Pos.CENTER);
		
		Circle smallCircle = new Circle(70); 
		smallCircle.setFill(Color.rgb(200, 200, 200));
		smallCircle.setStroke(Color.BLACK);
		smallCircle.setStrokeWidth(4);
		StackPane.setAlignment(smallCircle, Pos.CENTER);

		Polygon triangle01 = new Polygon(10,-100, 70,-10, -50,-10);
		triangle01.setTranslateY(-15);
		triangle01.setStroke(Color.DARKBLUE);
		triangle01.setFill(Color.BLUE);
		StackPane.setAlignment(triangle01, Pos.CENTER);
		
		
		answer.setFont(Font.font("Arial",  14));  //FontWeight.BOLD,
		answer.setTextFill(Color.WHITE);
		
		super.getChildren().clear();
		super.getChildren().add(bigCircle);
		super.getChildren().add(smallCircle);
		super.getChildren().add(triangle01);
		super.getChildren().add(answer);
	}

	public void setLabel(String msg) {
		answer.setText(msg);
	}
	
	public void showSaying() {
		answer.setText(ws.getRandomSaying());
	}
	
	public void showMystery(){
		answer.setText("  .   .\n.  . .    .\n  . . .. \n. .  .    .");
	}
}