package finalspractice;

import java.util.ArrayList;

public class Exhibit {
	
	// Enum Climate  arctic, forest, jungle, desert   		
		// make sure all the enum values are public 
		// by convention the enum values should be capitalized 
	public enum Climate{
		ARCTIC, FOREST, JUNGLE, DESERT
	}
	
	
	// ArrayList<Animal> animals
	public ArrayList<Animal> animals;
	
	// ArrayList<String> decorations 
	public ArrayList<String> decorations;
	// Climate environment   
	// a variable to store the climate type in
	Climate environment;
	
	// add getters and setters
	public Exhibit(Climate environment) {
		this.environment = environment;
	}
	
	public Climate getClimate() {
		return environment;
	}

	public void add(Animal x) {
		//animals.add(x);
		
	}
	



}
