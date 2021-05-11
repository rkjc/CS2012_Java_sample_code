package finalspractice;

import java.util.ArrayList;
import java.util.Scanner;

import finalspractice.Animal.FoodType;
import finalspractice.LandAnimal.CoveringType;

public class StartZoo {

	public static void main(String[] args) {
		System.out.println("Welcome to the Zoo. Enjoy your journey of discovery today as you visit the exhibits.");


// make 2 LandAnimal objects - fill in all their attributes
		LandAnimal anim_1 = new LandAnimal();
		anim_1.setDecoration("mushy grey with glossy spots");
		anim_1.setWeight(67.8);
		anim_1.setTypeOfAnimal("Vorgon");
		anim_1.setCovering(CoveringType.SKIN);
		anim_1.setFoodType(FoodType.OMNIVORE);
		anim_1.setSound("oooowwww helllloooooo huuuumaannn");
		
		
		LandAnimal anim_2 = new LandAnimal( "Penguin", 23.4, "skuwak purrr", FoodType.CARNIVORE, "Black and White Tuxcedo", CoveringType.FUR );
		
	

// make 2 Exhibit objects - set the climate
		Exhibit exhib_1 = new Exhibit();
		exhib_1.getDecorations().add("rock");
		exhib_1.getDecorations().add("other rock");
		exhib_1.getAnimals().add(anim_1);
		
		Exhibit exhib_2 = new Exhibit();
		exhib_2.getDecorations().add("log");
		exhib_2.getDecorations().add("other log");
		exhib_2.getAnimals().add(anim_2);
		
		//System.out.println(exhib_1.getDecorations().get(0));

// put some decoration in each exhibit (at least 1 decoration)
// add one LandAnimal to each exhibit

// make an ArrayList to hold both exhibits

		Scanner uinput = new Scanner(System.in);

		ArrayList<Exhibit> exhibitsArr = new ArrayList<>();
		exhibitsArr.add(exhib_1);
		exhibitsArr.add(exhib_2);
		
		
		int repeats = 0;
		while (repeats < exhibitsArr.size()) {
			System.out.println("\nWelcome to the Zoo. Push 'Enter' to visit the next exhibit.");
			uinput.nextLine();
			System.out.println("-----------------------------------------------------------");
			
			Exhibit tempExhib = exhibitsArr.get(repeats);
			System.out.println(tempExhib.getDecorations().get(0));
			System.out.println(tempExhib.getDecorations().get(1));
			
			LandAnimal tempLA = (LandAnimal) tempExhib.getAnimals().get(0);
			
			System.out.println(tempLA.getSound());
			System.out.println(tempLA.getTypeOfAnimal());
			System.out.println(tempLA.getWeight());
			System.out.println(tempLA.getFoodType());
			System.out.println(tempLA.getDecoration()); 
			System.out.println(tempLA.getCovering()); 
			
			
			
			System.out.println("-----------------------------------------------------------");
			repeats++;
		}
		
		System.out.println("Thank you for visiting the Zoo. Looking forward to seeing you again in the future!");
	}
}
