package finalspractice;

import java.util.ArrayList;

import finalspractice.Animal.Foodtype;
import finalspractice.Exhibit.Climate;
import finalspractice.LandAnimal.CoveringType;

public class StartZoo {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Zoo. Enjoy your journey of discovery today as you visit the exhibits.");
		// command line program
		
		// make 2 LandAnimal objects - fill in all their attributes
		// make 2 Exhibit objects - set the climate
		// put some decoration in each exhibit (at least 1 decoration)
		// add one LandAnimal to each exhibit
		
		Animal animal1 = new LandAnimal(CoveringType.FUR);
		Animal animal2 = new LandAnimal(CoveringType.SKIN);
		
		Exhibit climate1 = new Exhibit(Climate.FOREST);
		Exhibit climate2 = new Exhibit(Climate.DESERT);
		//climate1.decorations.add(0, "trees");
		
		climate1.add(animal1);
		climate2.add(animal2);
		
		
		
		
		// make an ArrayList to hold both exhibits 
		Exhibit[] exhibit = {climate1, climate2};
		int length = exhibit.length;
		
		// Make a while loop that will repeat as long as there are unseen exhibits (in this case it will run twice)
		while (length > 0) {
			System.out.println(exhibit[0].getClimate());
			System.out.println(exhibit[1].getClimate());
			//System.out.println(exhibit[0].getCovering());
			length = length-2;
		}
		
		// "Welcome to the Zoo. Push 'Enter' to visit the next exhibit.
		
		// every time the user pushes enter, display the name of the animal in the Exhibit
		
		// as you leave the loop thank the user for visiting the Zoo
		
		
		System.out.println("Thank you for visiting the Zoo. Looking forward to seeing you again in the future!");
		
	}

}
