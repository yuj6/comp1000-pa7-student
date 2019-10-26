/*********************************************************************
*	Lab 8 - PA7a
*	YOUR NAME HERE
*	COMP1000-XX  (ENTER YOUR SESSION, EITHER 05/06 or 07/08)
*	XX/XX/2016  (UPDATE THE DATE) 
*
**********************************************************************
*	Problem Description
*
*	Write a program that reads two numbers from the user and
*	prints out the sum of those two numbers. (UPDATE THE DESCRIPTION)
*
***********************************************************************
*	Analysis
*
*	Inputs:  Two integers, read from the user.
*
*	Outputs: The sum of the inputs.
*
**********************************************************************/

package edu.wit.cs.comp1000;

public class PA7a {
	
	/**
	 * Error to output if year is not positive
	 */
	static final String E_YEAR = "The year must be positive!";
	
	/**
	 * Error to output if the day is not between 0 and 6
	 */
	static final String E_DAY = "The day of January 1st must be between 0 and 6!";
	
	/**
	 * Determines if an input is a leap year
	 * 
	 * @param year year in question
	 * @ereturn true if a leap year
	 */
	public static boolean isLeapYear(int year) {
		return false; // TODO: replace with your code
	}
	
	/**
	 * Outputs a month to the console
	 * 
	 * @param month title
	 * @param startDay 0=Sunday ... 6=Saturday
	 * @param numDays number of days in the month
	 * @return day of the week of the last day of the month
	 */
	public static int printMonth(String month, int startDay, int numDays) {
		return 0; // TODO: replace with your code
	}

	/**
	 * Program execution point:
	 * input year, day of the week (0-6) of january 1
	 * output calendar for that year
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		// TODO: write your code here
	}

}
