/*
** This program will print out the number, squares and powers of a number.
*/
import java.util.Scanner;

public class SamplePracticalEasy
{

	public static void main(String[] args)
	{
		int n;
		int power = 1;
		boolean inputError;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("Enter a positive integer less than 10: ");
			n = in.nextInt();
			inputError = n < 1 || n > 9;
			if( inputError )
			{	System.out.print( "Error - number out of range." );
			}
		} while( inputError );

		for( int i=1; i <= n; i++ )
		{
			int square =  i * i;
			power = power * n;
			System.out.print(i);
			if(square < 100)
			{	System.out.print(" ");
			}
			if(square < 10)
			{	System.out.print(" ");
			}
			System.out.print(square);
			int digits = 0;
			int x = power;
			while(x > 0)
			{	x = x / 10;
				digits++;
			}
			for(int s = 0; s < 10-digits; s++)
			{	System.out.print(" ");
			}
			System.out.println(power);
		}
	}
}

/*
Enter a positive integer less than 10: -6
Error - number out of range.
Enter a positive integer less than 10: 77
Error - number out of range.
Enter a positive integer less than 10: 9
9 to the power of 1 =         9
9 to the power of 2 =        81
9 to the power of 3 =       729
9 to the power of 4 =      6561
9 to the power of 5 =     59049
9 to the power of 6 =    531441
9 to the power of 7 =   4782969
9 to the power of 8 =  43046721
9 to the power of 9 = 387420489

This would get you a 6 / 7
*/
