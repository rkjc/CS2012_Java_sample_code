package binaryio;

import java.io.*;
import java.util.Date;

public class Exercise17_07 {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// this was developed from the TestObjectInputStream.java example
		Double subTotal = 0.0;
		try ( // Create an input stream for file object.dat
				ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_06.dat"));) {

			Loan ln01 = (Loan) (input.readObject());
			subTotal = ln01.getLoanAmount();
			// hmmm ... maybe a loop to get the unknown number of additional loan objects stored in the file?

			System.out.println(subTotal);
		}
	}
}
