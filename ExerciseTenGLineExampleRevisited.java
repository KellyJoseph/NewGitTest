package Chapter3;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class ExerciseTenGLineExampleRevisited extends GraphicsProgram {
	
	public void run() {
		
		double width = BOARD_SIZE;
		double height = BOARD_SIZE;
		
		
		add(new GLine( 30, 60, 120, 60));
		//add(new GLine( 30, 90, 120, 90));
		//add(new GLine( 60, 30, 60, 120));
		//add(new GLine( 90, 30, 90, 120));
		
	}
	
	private static final double LINE_HEIGHT = 60;
	private static final double BOARD_SIZE = 60;
	

}
