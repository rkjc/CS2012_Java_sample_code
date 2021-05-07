package enumPractice2;

public class PlasticTeddyBears {
	
	public enum PaintColor { RED, BLUE, ORANGE, GREEN };
	public enum material {PLASTIC, LEATHER, METAL};
	int cost;
	private PaintColor bearColor;
	
	
	public PlasticTeddyBears(PaintColor theColor) {
		bearColor = theColor;
	}
	
	public void changeColor(PaintColor clr) {
		bearColor = clr;
	}
		
	public String getBearColor() {
		String strColor = bearColor.toString();
		return strColor;
	}
	
}
