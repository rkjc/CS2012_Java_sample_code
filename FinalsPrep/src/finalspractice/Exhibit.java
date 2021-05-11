package finalspractice;

import java.util.ArrayList;

public class Exhibit {
	
		public enum Climate  {ARCTIC, FOREST, JUNGLE, DESERT};
	
		ArrayList<Animal> animals;
		ArrayList<String> decorations; 
		Climate environment;  // a variable to store the climate type in
		
		
		public Exhibit() {
			animals = new ArrayList<>();
			decorations = new ArrayList<>();
		}
		
		
		public ArrayList<Animal> getAnimals() {
			return animals;
		}
		public void setAnimals(ArrayList<Animal> animals) {
			this.animals = animals;
		}
		public ArrayList<String> getDecorations() {
			return decorations;
		}
		public void setDecorations(ArrayList<String> decorations) {
			this.decorations = decorations;
		}
		public Climate getEnvironment() {
			return environment;
		}
		public void setEnvironment(Climate environment) {
			this.environment = environment;
		}
		
}
