/**
 * @(#)PairOfDice.java
 *
 *
 * @author 
 * Demonstrates the use of a class with overloaded constructors.
 */


public class PairOfDice {
	
	//Creates two dies objects, then rolls both dice a set number of times, counting the number of box cars that occur.
	
	
    public static void main (String[]args) {
    
    	final int ROLLS = 1000;
    	int boxCars = 0, num1, num2;
    	
    	Die die1 = new Die(); //creates a six-sided die
    	Die die2 = new Die(); //another creates a six-sided die
    	
    	for (int roll = 1; roll <= ROLLS;roll++)
    	{
    		num1 = die1.roll();// creates a six-sided
    		num2 = die2.roll();
    	
    	if(num1 == 6 && num2 == 6) //check for snake eyes
    		boxCars++;;
    	}
    	

    System.out.println("Number of rolls: " + ROLLS);
    System.out.println("Number of box cars; " + boxCars);
    System.out.println("Ratio: "+ (double)boxCars/ROLLS);
    
	}
}