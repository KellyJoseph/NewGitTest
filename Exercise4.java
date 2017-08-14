package Chapter3;

import acm.graphics.*;
import acm.program.*;

// A = pi r^ 2, but how do you write this in Java?

public class Exercise4 extends ConsoleProgram {

	public void run () {
		
		println("This program computes the area of a circle");
		double radius = readDouble("Enter value for radius: ");
		double AreaOfCircle = (pi *( radius * radius ));		
		println("Area of circle: " + AreaOfCircle);
		
	
		
	}
	private static final double pi = 3.1415926;
}