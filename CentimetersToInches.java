package Chapter3;

import acm.program.*;

public class CentimetersToInches extends ConsoleProgram {

	public void run () {
		
		println("This program converts cm to feet and inches.");
		double cm = readDouble("Enter value in cm: ");
		double totalinches = cm / CENTIMETERS_PER_INCH;
		int feet = (int) (totalinches / INCHES_PER_FOOT);
		double inches = totalinches - INCHES_PER_FOOT * feet;
		println(cm +"cm = " + feet + "ft + " + inches + "in");
			
	
		
	}
	
	private static final int INCHES_PER_FOOT = 12;
	private static final double CENTIMETERS_PER_INCH = 2.54;

}
