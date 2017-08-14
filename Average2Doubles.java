package Chapter3;

import acm.program.*;

public class Average2Doubles extends ConsoleProgram {
	

	public void run() {
		println("This program averages two numbers");
		double a = readDouble("enter value a: ");
		double b = readDouble("enter value b: ");
		double average = (a + b) / 2;
		println("The average is: " +
		average + ".");

	}

}
