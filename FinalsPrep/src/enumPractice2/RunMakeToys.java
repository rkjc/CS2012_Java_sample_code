package enumPractice2;

import enumPractice2.PlasticTeddyBears.PaintColor;
import javafx.application.Application;

public class RunMakeToys {
	public static void main(String[] args) {
		
		PlasticTeddyBears bear01 = new PlasticTeddyBears(PaintColor.GREEN);
		
		PaintColor farble = PaintColor.BLUE;
		
		// build the bear
		String bcolor = bear01.getBearColor();
		System.out.println(bcolor);
		
		bear01.changeColor(PaintColor.RED);
		bcolor = bear01.getBearColor();
		System.out.println(bcolor);
		
		bear01.changeColor(farble);
		bcolor = bear01.getBearColor();
		System.out.println(bcolor);
		
	}

}
