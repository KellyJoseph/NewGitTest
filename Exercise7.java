package Chapter3;

import acm.graphics.*;
import acm.program.*;

public class Exercise7 extends ConsoleProgram{
	
public void run () {
	
	println("This program converts kilos to pounds and ounces");	
	double kilos = readDouble("enter value in kg: "); 
	double pounds = (kilos * POUNDS_PER_KILO);
	double ounces = (pounds * OUNCES_PER_POUND);
	double lbs = ((int)(pounds));
	double oz = (pounds % kilos);
	double remainder = ((pounds - lbs) * OUNCES_PER_POUND);
	println(kilos + " kg = " + lbs + " lbs,  " + remainder + " oz");
	
	
	}


	
	private static final double OUNCES_PER_POUND = 16;
	private static final double POUNDS_PER_KILO = 2.2;

	
}

// find