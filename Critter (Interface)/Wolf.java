/*Project: Lab 7 Critter
 * Class: Wolf.java
 * Author: Kevin Cauchi
 * Date: 4/22/22
 *  This program runs the interface for the Wolf class
 */ 
/*
 * Went with the same code for the Bird since i wanted to keep the wolf to move in random directions 
 */

import java.util.Random;

public class Wolf implements Critter {

	public char getChar() {
		return 'W'; // Shows the letter "W" on interface for Mouse

	}

	private int moves = 0;
	private int path = 0; // Starting points

	public int getMove(CritterInfo info) {

		if (moves == 0) { // The Wolf will move 1 West
			moves++; // Adds 1
			path = WEST;
			return path; // Return to go one West
		}

		if (moves == 1) { // If West goes 1 then will move North
			moves = 0;
			path = NORTH;
			return path; // Will go 1 North
		}
		return path; // Returns the W-wolf on the interface

	}
}