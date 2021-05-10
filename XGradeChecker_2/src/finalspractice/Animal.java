package finalspractice;

public class Animal {
	

	// enum FoodType carnivore herbivore omnivore  
	public enum Foodtype{
		CARNIVORE, HERBIVORE, OMNIVORE
	}
		// make sure all the enum values are public
		// by convention the enum values should be capitalized 
	

	// String typeOfAnimal   
	//variable to hold the name of that type of animal, for example cat, or elephant
	public String typeOfAnimal;
	
	// double weight		// variable
	public double weight;
	// FoodType foodType   
	// variable to store the type of food it eats
	Foodtype foodtype;
	// String sound     
	// variable to store the noise it makes - for example "deep burping croak"
	public String sound;

}
