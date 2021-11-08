public class Power
{
	// function/methods works fine for exponents >= 0
	// no need to change it!
	public static double pow(int b, int e)
	{
		if (e == 0)			// base case, we need it for e=0!!!
		{	return 1;
		} else if (e == 1)	// base case
		{	return b;
		} else
		{	return b * pow(b, e - 1); // recursive call
		}
	}
	
	// helper function/method to simplify the use of power
	// decides whether to calculate power of + or - exponent
	public static double power(int b, int e)
	{
		if( e < 0 )
		{	return 1.0 / pow(b, -e);
		} else
		{	return pow(b, e);
		}
	}
	
	
	public static void main(String[] args)
	{
		int base, expo;
		base = IBIO.inputInt("Enter base: ");
		expo = IBIO.inputInt("Enter exponent: ");
		/* exponent could also be checked here like:
		if( expo < 0 )
		{	System.out.println( 1 / pow(base, -expo) );
		} else
		{	System.out.println( pow(base, expo) );
		}
		*/
		System.out.println( power(base, expo) );

	}
}
