/**
 * 
 */
package com.sqa.mc.basics;
import java.util.*;

/**
 * @author mc
 *
 */
public class EvaluateGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables
		String input;
		// Another variable to capture the number, no decimals because it does not support that (would have to change to a double):
		int gradeValue;
		// Create a Scanner object assign to variable scanner
		Scanner scanner = new Scanner(System.in);
		// Request a grade a value from the user
		System.out.println("Please input grade value (0-100):");
		// Set user defined input and declare values at the top
		input = scanner.nextLine();
		// Converting the number from the string input
		gradeValue = Integer.parseInt(input);
		// Cant evaluate a string 
		if (gradeValue >= 90) {
			System.out.println("Grade is an A.");
		}
		else if
			(gradeValue >= 80) {
			System.out.println("Grade is an B.");
			
		}
		else if
		(gradeValue >= 70) {
		System.out.println("Grade is an C.");
		
		}
		else if
		(gradeValue >= 60) {
		System.out.println("Grade is an D.");
		
		}
		else if
		(gradeValue >= 50) {
		System.out.println("Grade is an F.");
		
		}
		else if
		(gradeValue <= 50) {
		System.out.println("Grade is an F.");
		}
	}

}
