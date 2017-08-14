package Chapter3;

import acm.graphics.*;
import acm.program.*;


public class Exercise2 extends ConsoleProgram {

	public void run () {
		
		println("This program calculates Balance and simple interest after one year");
		double StartingBalance = readDouble("Enter account balance: ");
		double AnnualInterestRate = readDouble("Enter annual interest rate: ");
		double Interest = ((StartingBalance/100) * AnnualInterestRate);
		double BalanceAfterOneYear = (StartingBalance + Interest);  
		println("Balance after one year: " + BalanceAfterOneYear);
		
	
		
	}
	
}