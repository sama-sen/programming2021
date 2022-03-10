/*
 * Chapter9 code
 * simulation of 100 rolls of a 6-sided die
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#random()
 */


public class Pr9_3
{
	public static int random(int max)
	{
		double r =  Math.random() * max;
		int random = (int)(r + 1);
		return random;
	}
	
	public static void printArray(int[] a)
	{
		for (int i = 0; i < a.length; i++) // traversal of array
		{	IBIO.output("index: " + i + "    Value: " + a[i]);
		}
	}
	
	public static void main (String[] args)
	{	final int MAXROLLS = 100;	// constants, how many rolls
		final int MAXSIDES = 6;		// HOW MANY SIDES OF THE DIE
		//declare     instantiation
		int[] rolls = new int[MAXROLLS]; // create the array
		for (int i = 0; i < rolls.length; i++) // also MAXROLLS may be used in place of num.length
		{	
			rolls[i] = random(MAXSIDES);
		}
		// printArray(rolls);
		// Practice: turn lines 35 to 42 into a void method
		for(int r = 1; r <= MAXSIDES; r++)
		{	for (int i = 0; i < rolls.length; i++)
			{	if(rolls[i] == r)
				{	System.out.print( r );
				}
			}
			System.out.println();
		}
	}
}

