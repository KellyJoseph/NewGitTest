package Chapter3;

import acm.graphics.*;
import acm.program.*;

public class Exercise8TheManFromSaintIves extends ConsoleProgram {

	public void run () {
		
// write a program to calculate how many from each group os coming FROM St Ives
	
		//As I was going to St. Ives,
		//I met a man with seven wives,
		//Each wife had seven sacks,
		//Each sack had seven cats,
		//Each cat had seven kits,
		//Kits, cats, sacks and wives,
		//How many were going to St. Ives?
	
		int man = 1;
		int wives = man * 7;
		int sacks = 7 * wives;
		int cats = 7 * sacks;
		int kits = 7 * cats;
		
		println("man" + man 
				+ "wives" + wives 
				+ "sacks" + sacks 
				+ "cats" + cats 
				+ "kits" + kits);
		
				
		
		
	}
}
