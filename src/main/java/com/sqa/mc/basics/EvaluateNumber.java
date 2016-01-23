/**
 * 
 */
package com.sqa.mc.basics;

/**
 *   File Name: EvaluateNumber.java<br>
 *
 *   Crosno, Meghan<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 23, 2016
 *   
 */


/**
 * EvaluateNumber //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Crosno, Meghan
 * @version     1.0.0
 * @since       1.0
 *
 */
public class EvaluateNumber {
	
	// Declare numbers for class
	
	static int num1 = 8;
	static int num2 = 12;
	static int num3 = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Intro to the appp
		System.out.println("Number Evaluate App");
		// If number is less than 10
		if(num1 < 10 ) {
			//Print details to console
			System.out.println("Number " + num1 + " is less than 10.");
		} else if(num1 > 10) {
			// Print details to console
			System.out.println("Number " + num1 + " is greater than 10");
			// If number is equal to 10
		
		} else if (num1 == 10) {
			System.out.println("Nunber is equal to 10.");
		}
	}

	
}