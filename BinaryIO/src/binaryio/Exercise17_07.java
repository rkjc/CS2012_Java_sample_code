package binaryio;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exercise17_07 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		double total = 0;
		int count = 0;

		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_06.dat"));) {
			// Read a string, double value, and object from the file

			while (true) {
				Loan temploan = (Loan) (input.readObject());
				System.out.println(temploan.getLoanAmount());
				total = total + temploan.getLoanAmount();
				count += 1;
			}
		} catch (EOFException e) {
			System.out.println(total);
			System.out.println(count);
		}

	}

//		try (ObjectInputStream input = new ObjectInputStream(
//				new BufferedInputStream(new FileInputStream("Exercise17_06.dat")));) {
//			while (true) {
//				Loan tempLoan = (Loan) (input.readObject());
//				total += tempLoan.getLoanAmount();
//				count += 1;
//			}
//
//		} catch (EOFException e) {
//			System.out.println("total= " + total);
//			System.out.println("count= " + count);
//		}

}
