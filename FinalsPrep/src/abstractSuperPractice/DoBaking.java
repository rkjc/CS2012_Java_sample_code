package abstractSuperPractice;

public class DoBaking {

	public static void main(String[] args) {
	
		// BakedGood bGood = new BakedGood(); // <- can not make object using abstract class (uncomment to see it fail)

		// can not make object using no attribute constructor if it is not defined (uncomment to see it fail)
		// Cake a_cake = new Cake();  
		
		//can make object using the existing, defined, constructor (or any others you define)
		Cake b_cake = new Cake(25.4); 
		
		double tempCookTime = b_cake.getTimeToCook(); // <- notice that the Cake object is using the BakedGood method as its own
		String tempCakeName = b_cake.getCakeName();
		System.out.println( tempCookTime ); 
		System.out.println( tempCakeName );
		
		//can make object using the existing, defined, constructor (or any others you define)
		Cake m_cake = new Cake("Dark Chocolate", 45.5); 
		
		System.out.println();
		System.out.println(m_cake.getTimeToCook() + "  " +  m_cake.getCakeName());
		
	}
}
