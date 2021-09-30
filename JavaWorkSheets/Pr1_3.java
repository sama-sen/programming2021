/*
 * Problem 1.3
 * Write a program that will print out the first 10 numbers, their squares and their cubes.
 * x goes from 1 to 10
 * calculate and output x, x^2, x^3
 */


public class Pr1_3
{
	
	public static void main (String[] args)
	{
		IBIO.output("\nFrom 1:");
		for(int x = 1; x <= 10; x=x+1)
		{
			IBIO.output(x + " " + x*x + " " + x*x*x);
		}
		
		IBIO.output("\nFrom 0:");
		for(int x = 0; x < 10; x++)
		{
			IBIO.output(x + "\t" + x*x + "\t" + x*x*x);
		}
	}
}

