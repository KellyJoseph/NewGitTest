package Chapter3;

/*
 * THis program creates a redGRect and a green GOval using the same
 * parameters. This version takes the width and height of the shapes
 * from the named constants: FIGURE_WIDTH and FIGURE_HEIGHT.
 * The dimensions of both shapes can be changed by changing the 
 * values of these named constants.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.Color;

public class ReturnToGRectandGOval extends GraphicsProgram {

	public void run() {
		
		double x = (getWidth() - FIGURE_WIDTH) / 2;
		double y = (getHeight() - FIGURE_WIDTH) / 2;
		GRect rect = new GRect(x, y, FIGURE_WIDTH, FIGURE_HEIGHT);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		GOval oval = new GOval(x, y, FIGURE_WIDTH, FIGURE_HEIGHT);
		oval.setFilled(true);
		oval.setFillColor(Color.GREEN);
		add(oval);

		
	}
	
	private static final double FIGURE_WIDTH = 125;
	private static final double FIGURE_HEIGHT = 125;
	

}
