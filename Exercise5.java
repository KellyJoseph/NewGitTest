package Chapter3;

import acm.graphics.*;
import acm.program.*;

public class Exercise5 extends ConsoleProgram {

	public void run () {
		
		println ("This program converts Faranheit to Celsius");
		double Faranheit = readDouble("Enter Faranheit temperature: ");
		double Celsius = (((Faranheit - 32) / 9 ) * 5);
		println ("Degrees Celsius: " + Celsius);

	}

}
