/*Project: Lab 7 Critter
 * Class: Bird.java
 * Author: Kevin Cauchi
 * Date: 4/22/22
 *  This program runs the interface for the Bird class
 */


import java.util.Random;
public class Bird implements Critter {

	public char getChar() {
		return 'B'; // shows the letter "B" on interface for Bird

	}

	public int getMove(CritterInfo info) {
		Random r = new Random(); // Makes r into random number
		int path;
		path = r.nextInt(4) + 1; // Makes it into 1-4 direction
		
		if 
		(path==1) {
			return NORTH;  // If 1 then goes north 
		}
		else if (path==2) {// If 2 then goes East  

			return EAST;
		}
		else if (path==3) {// If 3 then goes South 

			return SOUTH;
		}
		else if (path==4) { // If 4 then goes West 

			return WEST;
		}

		
		
				return path; // Returns where it is moving

	}

}
