/*Project: Lab 7 Critter
 * Class: Turtle.java
 * Author: Kevin Cauchi
 * Date: 4/22/22
 *  This program runs the interface for the Turtle class
 
 
 * Example Done in class by Professor -
 */

public class Turtle implements Critter {

	private int myCount;

	public char getChar() {

		return 'T'; // Shows the letter "T" on interface for Turtle
	}

	public int getMove(CritterInfo info) {
		int next = myCount / 5 % 4;
		myCount++; // Adds 1
		if (next == 0)
			return SOUTH; // Returns South
		else if (next == 1)
			return WEST; // Returns West
		else if (next == 2)
			return NORTH; // Returns North
		else
			return EAST; // Returns East

	}
}