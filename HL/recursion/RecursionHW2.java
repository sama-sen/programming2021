public class RecursionHW2
{
	public static int result(int n)
	{
		System.out.println(">>> " + n);
		if (n == 0)			// base case, we need it for n=0!!!
		{	return 1;
		} else if (n == 1)	// base case
		{	return 2;
		} else
		{	return 2 * result(n - 1); // recursive call
		}
	}
	
	
	public static void main(String[] args)
	{
		System.out.println( result(0) ); // causes an error because the original algorithm does not provide a (base) case for n=0
		// this error is infinite recursion; Java runs out of memory when keeping track of too many recursive calls
		System.out.println();
		System.out.println( result(1) );
		System.out.println();
		System.out.println( result(2) );
		System.out.println();
		System.out.println( result(8) );
		System.out.println();
		System.out.println( result(10) );

	}
}

/*	( this is a multi-line comment) 
 * 	IBIO.output()	is the same as System.out.println();
 * 	IBIO.out()		is the same as System.out.print();
 */
