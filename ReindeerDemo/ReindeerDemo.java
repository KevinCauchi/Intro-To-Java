


public class ReindeerDemo {
public static void main(String[]args) {
	
	Reindeer r1= new Reindeer();
	r1.showInfo();
	Reindeer r2= new Reindeer("Frosty",25.5);
	r2.setName("Prancer");
	r2.getName();
	r2.setWeight(225.45);
	r2.showInfo();
	
}	
}


/*
Name	Rudolph
Weight	125.55
Have a nice Break
Name	Prancer
Weight	225.45
Have a nice Break
*/
