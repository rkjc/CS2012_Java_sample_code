package abstractPractice;

public class RunAbstract {

	public static void main(String[] args) {
		
		TwoConcrete twoC = new TwoConcrete();
		
		
		System.out.println("tempDoub: " + twoC.dNum + "  tempInt1: " + OneAbstract.iNum + "  tempInt2: " + TwoConcrete.iNum);
		
		twoC.dNum = 5.4;
		OneAbstract.iNum = 56;

		System.out.println("tempDoub: " + twoC.dNum + "  tempInt1: " + OneAbstract.iNum + "  tempInt2: " + TwoConcrete.iNum);
		
		TwoConcrete.iNum = 9002;
		
		System.out.println("tempDoub: " + twoC.dNum + "  tempInt1: " + OneAbstract.iNum + "  tempInt2: " + TwoConcrete.iNum);
		
	}

}
