package Chapter3;

import acm.program.*;

public class InchesToCentimeters extends ConsoleProgram  {

	public void run () {
		
		println("This program converts inches to cm");
		double inches = readDouble("Enter value in inches: ");
		double cm = inches * CENTIMETERS_PER_INCH;
		println("Centimeters: " + cm + ".");
			
		
	}
	
	//note, outside first curly brace
	private static final double CENTIMETERS_PER_INCH = 2.54;

}
