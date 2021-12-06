/*
** This program will print out the number, squares and powers of a number.
*/
import java.util.Scanner;

public class SamplePracticalHard
{
	public static int digits(int n)
	{
		int digits = 0;
		while(n > 0)
		{	n = n / 10;
			digits++;
		}
		return digits;
	}

	public static void padding( int n, int maxSpaces )
	{
		int d = digits(n);
		while( d < maxSpaces )
		{
			System.out.print(" ");
			d++;
		}
	}
	
	public static void commas( int n )
	{
		if(n < 1000)
		{	System.out.print(n);
		} else if(n < 1000000)
		{	int ts = n / 1000;
			int rm = n % 1000;
			System.out.print( ts + "," );
			if(rm < 100)
			{	System.out.print( "0" );
			}
			if(rm < 10)
			{	System.out.print( "0" );
			}
			System.out.print( rm );
		} else if(n < 1000000000)
		{	int ts = n / 1000000;
			int rm = n % 1000000;
			System.out.print( ts + "," );
			n = rm;
			ts = n / 1000;
			if(ts < 100)
			{	System.out.print( "0" );
			}
			if(ts < 10)
			{	System.out.print( "0" );
			}
			rm = n % 1000;
			System.out.print( ts + "," );
			if(rm < 100)
			{	System.out.print( "0" );
			}
			if(rm < 10)
			{	System.out.print( "0" );
			}
			System.out.print( rm );
		}
	}

	public static void main(String[] args)
	{
		int n;
		int t = 1;
		boolean inputError = true;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("Enter a positive integer less than 10: ");
			n = in.nextInt();
			if(n<1 || n>9)
			{
				System.out.print( "Error - number out of range." );
				inputError = true;
			}
			else
				inputError = false;
		} while( inputError );

		for( int i=1; i <= n; i++ )
		{
			t = t * n;
			System.out.print( i + " ");
			padding(i*i, 2);
			System.out.print( (i*i) + " " );
			padding(t, 9);
			// account for commas
			if(t < 1000000)
			{	System.out.print(" ");
			}
			if(t < 1000)	
			{	System.out.print(" ");
			} 
			commas(t);
			System.out.println();
		}
		in.close();
	}
}

/*
Enter a positive integer less than 10: 12
Error - number out of range.Enter a positive integer less than 10: -9
Error - number out of range.Enter a positive integer less than 10: 4
1  1           4
2  4          16
3  9          64
4 16         256

Enter a positive integer less than 10: 5
1  1           5
2  4          25
3  9         125
4 16         625
5 25       3,125

Enter a positive integer less than 10: 9
1  1           9
2  4          81
3  9         729
4 16       6,561
5 25      59,049
6 36     531,441
7 49   4,782,969
8 64  43,046,721
9 81 387,420,489


*/
