/* 
 * Factorial2.java
 * Intermediate version of the factorial problem
 * 
 */


public class Factorial2
{
	public static long factorial(int n)
	{
		if( n == 0 )
		{
			return 1;
		} else if( n < 0 )
		{	
			return -1;
		}
		long f = 1;
		for(int i = 2; i <= n; i++)
		{	f = f * i;
		}
		return f;
	}
		
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("Enter an int: ");
		long result = factorial(n);
		while(result == -1)
		{	System.out.println("Error - no factorials for negatives!");
			n = IBIO.inputInt("Enter an int: ");
			result = factorial(n);
		}
		System.out.println( result );

	}
}

