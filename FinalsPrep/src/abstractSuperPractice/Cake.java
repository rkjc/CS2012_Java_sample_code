package abstractSuperPractice;

public class Cake extends BakedGood {
	
	// must have constructor that matches the super class
	
	// *** attributes ***
	private String cakeName;
	
	
	// *** Constructors ***
	public Cake(double cookTime) {
		super(cookTime);  // super-class constructor call - how to setup private attributes in the super-class without using setters
		cakeName = "generic";
	}
	
	public Cake(String name, double time) {
		super(time); 
		cakeName = name;
	}

	
	// *** Setter and Getter methods ***
	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	
}
