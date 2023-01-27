package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickleCount = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickleCountInt = Integer.parseInt(nickleCount);
		// Ask the user how many dimes they have, and convert their answer
		String dimeCount = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimeCountInt = Integer.parseInt(dimeCount);
		// Ask the user how many quarters they have, and convert their answer
		String quarterCount = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarterCountInt = Integer.parseInt(quarterCount);
		// Calculate how much money the user has.  Hint: Use a double variable 
		int fullCount = (nickleCountInt*5) + (dimeCountInt*10) + (quarterCountInt*25);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		double finalAnswer = (double)fullCount/100;
		System.out.println(finalAnswer);
		JOptionPane.showMessageDialog(null,  "You have $" + finalAnswer);
	}
}

