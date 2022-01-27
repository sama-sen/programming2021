/*
 * Ch8C.java
 * Demo of nested loops
 * 
 */
import java.util.Scanner;

public class Ch8C
{
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int loops	= 0;
		System.out.println("Enter N = ");
		int n = input.nextInt();
		input.close();

		System.out.println("Compare...");
		System.out.printf("%3S\t%3S\t%3S\n", "i", "j" ,"k");
		for(int i = 0; i < n; i++)
		{	for(int j = 0; j < n; j++)
			{	for(int k = 0; k < n; k++)
				{
					System.out.printf("%3d\t%3d\t%3d\n", i, j ,k);
					loops++; // count the iterations (repetitions/loops)
				}
			}
		}
		System.out.println("Repetitions        : " + loops);
		
		
		System.out.println("... with");
		loops = 0;
		System.out.printf("%3S\t%3S\t%3S\n", "i", "j" ,"k");
		for(int i = 0; i < n; i++)
		{	for(int j = 0; j < n; j++)
			{	for(int k = 0; k < n; k++)
				{
					if( j >= i && k >= j)
					{	System.out.printf("%3d\t%3d\t%3d\n", i, j ,k);
						counter++; // avoid repeated combinations
					}
					loops++; // count the iterations (repetitions/loops)
				}
			}
		}
		System.out.println("Repetitions        : " + loops);
		System.out.println("Unique combinations: " + counter);
	}
}

