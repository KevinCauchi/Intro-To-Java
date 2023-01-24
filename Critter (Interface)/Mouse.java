/*Project: Lab 7 Critter
 * Class: Mouse.java
 * Author: Kevin Cauchi
 * Date: 4/22/22
 *  This program runs the interface for the Mouse class
 */  

public class Mouse implements Critter {

	public char getChar() {
		return 'M'; // Shows the letter "M" on interface for Mouse

	}

	private int moves = 0;
	private int path = 0; // Starting points

	public int getMove(CritterInfo info) {

		if (moves == 0) { // The Mouse will move 1 West
			moves++; // Adds 1
			path = WEST;
			return path; // Return to go one West
		}

		if (moves == 1) { // If West goes 1 then will move North
			moves = 0;
			path = NORTH;
			return path; // Will go 1 North
		}
		return path; // Returns the M-mouse on the interface

	}
}