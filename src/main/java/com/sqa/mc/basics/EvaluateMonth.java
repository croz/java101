/**
 * 
 */
package com.sqa.mc.basics;

import java.util.*;

/**
 * @author mc
 *
 */
public class EvaluateMonth {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// Delcaring variable after what number you would like to imput
		String input;
		// Creating a Scanner object and setting to keyboard imput
		Scanner scanner = new Scanner(System.in);
		// Ask user for a number
		System.out.print("What number would you like to imput:");
		// Get input from the user *defined above* and set into variable
		input = scanner.nextLine();
		// Evaluating the month -- switch statesments based on input
		switch (input) {
		// Case for January
		case "1":
			System.out.println("January");
			break;
		// Case for Feb
		case "2":
			System.out.println("Feb");
			break;
			
		// Case for March
		case "3":
			System.out.println("March");
			break;

		// Case for April
		case "4":
			System.out.println("April");
			break;

		// Case for May
		case "5":
			System.out.println("May");
			break;

		// Case for June
		case "6":
			System.out.println("June");
			break;

		// Case for July
		case "7":
			System.out.println("July");
			break;

		// Case for Aug
		case "8":
			System.out.println("Aug");
			break;

		// Case for Sept
		case "9":
			System.out.println("Sept");
			break;

		// Case for Oct
		case "10":
			System.out.println("Oct");
			break;

		// Case for Nov
		case "11":
			System.out.println("Nov");
			break;

		// Case for December
		case "12":
			System.out.println("Dec");
			break;
		default:
			System.out.println("Invalid Number");
			break;
		}
		//Exit application
		System.out.println("Good Bye!");
	}

}
