package abstractSuperPractice;

public abstract class BakedGood {
	// ^^^ abstract ^^^
	// abstract class can not make a concrete object - the constructor is only for the sub-class
	
	// *** attributes ***
	double timeToCook;

	// *** Constructors ***
	// note - did not replace the default no attribute constructor - so no no-attribute constructor is available
	// the invisible default constructor is not available when a constructor with an attribute is defined
	
	public BakedGood(double cookTime) {  // one attribute constructor called by super(cookTime in sub-class (Cake)
		timeToCook = cookTime;
	}
	
	
	// *** Setter and Getter methods ***	
	public double getTimeToCook() {
		return timeToCook;
	}

	public void setTimeToCook(double timeToCook) {
		this.timeToCook = timeToCook;
	}
	
}
