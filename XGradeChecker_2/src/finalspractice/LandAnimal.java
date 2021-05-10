package finalspractice;

public class LandAnimal extends Animal{
	
	//make this a subclass of Animal
	
	// enum CoveringType  fur,  skin,  scales    
		// make sure all the enum values are public 
		// by convention the enum values should be capitalized 
	public enum CoveringType{
		FUR, SKIN, SCALES
	}
	
	// *these should be private
	// String decoration    
	// variable to store the description of color and patterns - for example "blue fur with orange spots"
	private String decoration;
	
	
	
	// CoveringType covering    //variable to store CoveringType 
	CoveringType covering;
	
	// make a constructor 
	LandAnimal(){
		
	}
	
	// add getters and setters for all the attributes
	public LandAnimal(CoveringType covering) {
		this.covering = covering;
	}
	
	public CoveringType getCovering() {
		return covering;
	}
	
	


}
