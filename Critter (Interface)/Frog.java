/*Project: Lab 7 Critter
 * Class: Frog.java
 * Author: Kevin Cauchi
 * Date: 4/22/22
 *  This program runs the interface for the Frog class
 */

import java.util.Random;

public class Frog implements Critter { // Class

	public char getChar() { // shows the letter "F" on interface for Frog
		return 'F';

	}

	public int getMove(CritterInfo info) {
		Random r = new Random(); // Makes r into random number
		int shift;
		shift = r.nextInt(4) + 1; // Makes it into 1-4 direction
		int path = 3; // Finds a direction in a switch then moves 3 in that direction

		if (shift == 1) {
			for (int i = 0; i < path; i++) { // If the random number generated is = 1 then moves 1 North
				return NORTH;
			}
		}

			if (shift == 2) {
			for (int i = 0; i < path; i++) {	// If the random number generated is = 2 then moves 1 East

				return EAST;
			}
			}
		if (shift == 3) {
		for (int i = 0; i < path; i++) {	// If the random number generated is = 3 then moves 1 South

			return SOUTH;
					}
		}
		if (shift == 4) {
			for (int i = 0; i < path; i++) {	// If the random number generated is = 4 then moves 1 West

			return WEST;
	}
		}

		return path; // Returns 3 in that direction
}
} // Returns the path that Frog is going to take
