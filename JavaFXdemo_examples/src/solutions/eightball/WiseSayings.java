package solutions.eightball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WiseSayings {
	
	Random rnd = new Random();

	private String [] sayings = {" As I\nsee it,\n  yes.",
			" Ask\nagain\n later.",
			" Better\n not tell\nyou now.",
			"Cannot\npredict\n  now.",
			"\n  Concentrate\nand ask again.",
			"Don’t\ncount\n  on it.",
			"  It is\ncertain.",
			"    It is\ndecidedly\n     so.",
			"Most\nlikely.",
			"My reply\n  is no.",
			"    My\nsources\n say no.",
			"Outlook\n not so\n good.",
			"Outlook\n  good.",
			"  Reply\n   hazy,\ntry again.",
			"Signs\npoint\nto yes.",
			"  Very\ndoubtful.",
			"Without\na doubt.",
			"Yes.",
			"    Yes\n      –\ndefinitely.",
			"  You\nmay rely\n  on it. "};
	
	public String getRandomSaying() {
		int select = rnd.nextInt(sayings.length);
		return sayings[select];
	}
	
}
