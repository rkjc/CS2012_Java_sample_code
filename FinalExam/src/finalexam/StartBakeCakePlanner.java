package finalexam;

import java.util.Scanner;

public class StartBakeCakePlanner {

	public static void main(String[] args) {
		System.out.println("Enter cost of ingredients per measurment unit to determine total cost of cake.");

		// TODO - Make 3 WetIngredient objects and fill out the attributes
		   // EXCEPT - do not set the cost-per-unit, make sure the constructor sets it to default of 0.0.

		// TODO - Make 3 WetIngredient objects and fill out the attributes
		   // EXCEPT - do not set the cost-per-unit, make sure the constructor sets it to default of 0.0.

		// TODO - Make a IngredientList object.

		// TODO - Add all the ingredient to the ingredientList.

		
		// get the number of items in the list of ingredients 
		int numberItems = 1; // <-- TODO - actually not '1', fix this

		// loop through the list of ingredients and set the cost for each unit amount
		Scanner userinput = new Scanner(System.in);
		double tempCost = 0.0;
		int item = 0;
		while (item < numberItems) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Ingredient Type,\tMeasurment Units,\tCAmount Used,\tCost Per Unit");
			// TODO - get the next ingredient object in the list
			// something something .get(item)
			
			// TODO - display ingredient info
			System.out.println("*your ingredient info goes here*"); // <-- fix this

			System.out.print("\nEnter the cost for a single unit of this ingredient: "); 
			
			tempCost = userinput.nextDouble(); // just going to trust the user for good input values
			
			// TODO - set the cost of a unit amount of the ingredient
			// use the setter to change the Cost Per Measurement Amount

			item += 1;
		}
		userinput.close();

		
		// display all of the ingredients together one last time
		System.out.println("-----------------------------------------------------");
		System.out.println("Ingredient Type,\tMeasurment Units,\tAmount Used,\tCost Per Unit");
		for (int i = 0; i < numberItems; i++) {
			// TODO - display ingredient list item info
			System.out.println("*your ingredient info goes here*"); // <-- fix this
		}
		System.out.println("-----------------------------------------------------");
		
		// TODO - fix this
		System.out.println("Total cost of cake ingredients: " + "*get the total cost and put it here*");

		System.out.println("-----------------------------------------------------");
	}

}
