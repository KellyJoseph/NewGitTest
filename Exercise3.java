package Chapter3;

import acm.graphics.*;
import acm.program.*;


public class Exercise3 extends ConsoleProgram {

	public void run () {
		
		println("This program calculates Balance and compound interest after two year");
		double StartingBalance = readDouble("Enter account balance: ");
		double AnnualInterestRate = readDouble("Enter annual interest rate: ");
		double Interest = ((StartingBalance/100) * AnnualInterestRate);
		double BalanceAfterOneYear = (StartingBalance + Interest);  
		double InterestAfterTwoYears = ((BalanceAfterOneYear/100) * AnnualInterestRate);
		double BalanceAfterTwoYears = ( BalanceAfterOneYear + InterestAfterTwoYears);
		println("Balance after one year: " + BalanceAfterOneYear);
		println("Balance after two years: " + BalanceAfterTwoYears);
		
	
		
	}
	
}