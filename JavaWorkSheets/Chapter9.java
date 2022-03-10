/*
 * Chapter9 code
 * simulation of 100 rolls of a 6-sided die
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#random()
 */


public class Chapter9
{
	public static int random(int max)
	{
		double r =  Math.random() * max;
		int random = (int)(r + 1);
		return random;
	}
	public static void main (String[] args)
	{	final int MAXROLLS = 100;	// constants, how many rolls
		final int MAXSIDES = 6;		// HOW MANY SIDES OF THE DIE
		//declare   instantiation
		int[] rolls = new int[MAXROLLS]; // create the array
		// Populate array with die rolls
		for (int i = 0; i < rolls.length; i++) // also MAXROLLS may be used in place of num.length
		{	
			rolls[i] = random(MAXSIDES);
		}
		
		
		for (int i = 0; i < rolls.length; i++) // traversal of array
		{	IBIO.output("index: " + i + "    Value: " + rolls[i]);
		}
	}
}

