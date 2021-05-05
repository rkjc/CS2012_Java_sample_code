package solutions;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BusyBoxShapes {

	Circle mycircle = new Circle();
	Circle mycircle2 = new Circle();
	Circle mycircle3 = new Circle();

	public BusyBoxShapes() {

		// mycircle.setCenterX(25);
		// mycircle.setCenterY(25);
		mycircle.setRadius(10);
		mycircle.setStroke(Color.RED);
		mycircle.setFill(Color.SKYBLUE);
		// StackPane.setAlignment(mycircle, Pos.CENTER_LEFT);
		StackPane.setAlignment(mycircle, Pos.CENTER);

		mycircle2.setRadius(10);
		mycircle2.setStroke(Color.RED);
		mycircle2.setFill(Color.SKYBLUE);

		mycircle3.setCenterX(370);
		mycircle3.setCenterY(400);
		mycircle3.setRadius(20);
		mycircle3.setStroke(Color.GREEN);
		mycircle3.setFill(Color.LIME);
		// StackPane.setAlignment(mycircle, Pos.CENTER_LEFT);
		// StackPane.setAlignment(mycircle, Pos.CENTER);
	}
	
	public Circle getCircle1() {
		return mycircle;
	}
	
	public Circle getCircle2() {
		return mycircle;
	}
	
	public Circle getCircle3() {
		return mycircle;
	}

}
