package Chapter3;

import acm.graphics.*;
import acm.program.*;


public class InchesToFeetExtended extends ConsoleProgram {

	public void run () {
		
		println("This program converts feet and inches to cm");
		double feet = readDouble("Enter value in feet");
		double inches = readDouble("Enter value in Inches");
		double TotalInches = ((feet * INCHES_PER_FOOT) + inches);  
		double cm = TotalInches * CENTIMETERS_PER_INCH;
		println(feet + "Feet" + inches +"Inches = " + cm + "cm");
		
			
	
		
	}
	
	private static final int INCHES_PER_FOOT = 12;
	private static final double CENTIMETERS_PER_INCH = 2.54;

}