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

	private Label answerLabel = new Label("o_O");
	WiseSayings ws = new WiseSayings();
	
	public MagicEightBall() {	
		//answerLabel.setAlignment(Pos.CENTER);
		
		Circle circ01 = new Circle(100); 
		circ01.setFill(Color.rgb(200, 200, 200));
		circ01.setStroke(Color.BLACK);
		circ01.setStrokeWidth(40);

		Polygon triangle01 = new Polygon(10, -100, 70, -10, -50,-10);
		triangle01.setTranslateY(-15);
		triangle01.setStroke(Color.DARKBLUE);
		triangle01.setFill(Color.BLUE);	
		
		answerLabel.setFont(Font.font("Arial",  14));  //FontWeight.BOLD,
		answerLabel.setTextFill(Color.WHITE);
		
		getChildren().clear();
		getChildren().add(circ01);
		getChildren().add(triangle01);
		getChildren().add(answerLabel);
	}
	
	public void showSaying() {
		answerLabel.setText(ws.getRandomSaying());
	}
	
	public void showMystery(){
		answerLabel.setText("  .   .\n.  . .    .\n  . . .. \n. .  .    .");
	}
}