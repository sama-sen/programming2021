/*
 * Chapter 8 additional example
 * 
 * 
 * 
 */


public class Ch8B
{
	
	public static void main( String args[])
	{
		int counter = 0;
		IBIO.output( "i  j  I+J" );
		for (int i = 1; i <= 10; i++)
		{	for (int j = 1; j <= 10; j++)
			{
				if ( good(i,j) )
				{	IBIO.output( i + " " + j + " " + (i+j) );
					counter++;
				}
			}
		}
		System.out.println(counter);
		
	}
	
	public static boolean isPrime(int n)
	{
		if(n < 2)
		{	return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n % i == 0)
			{	return false;
			}
		}
		return true;
	}
	
	// method to test for the property that we are looking for
	public static boolean good(int a, int b)
	{	// two numbers added together equal a prime
		int x = a + b;
		return isPrime(x);
	}
}

