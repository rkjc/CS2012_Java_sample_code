package finalspractice;

import finalspractice.Animal.FoodType;
import finalspractice.LandAnimal.CoveringType;

public class LandAnimal extends Animal{
	
		public enum  CoveringType {FUR,  SKIN,  SCALES};    
		
		private String decoration;    // variable to store the description of color and patterns - for example "blue fur with orange spots"
		private CoveringType covering;   //variable to store CoveringType 
		
		public LandAnimal() {
		}
		
		public  LandAnimal(String typeOfAnimal, double weight, String sound, FoodType fudtyp, String decor, CoveringType coverUp ) {
			setTypeOfAnimal(typeOfAnimal);
			setWeight(weight);
			setSound(sound);
			setFoodType(fudtyp);
			decoration = decor;
			covering = coverUp;
		}
		
		// add getters and setters for all the attributes
		
		public String getDecoration() {
			return decoration;
		}

		public void setDecoration(String str) {
			decoration = str;
		}

		public CoveringType getCovering() {
			return covering;
		}

		public void setCovering(CoveringType covering) {
			this.covering = covering;
		}
}

