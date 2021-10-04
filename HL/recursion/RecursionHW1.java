public class RecursionHW1
{
	public static int sum(int n)
	{
		//System.out.println(">>> " + n); // uncomment this line to see how N changes as the method is called recursively
		if (n == 1)			// base case
		{	return 1;
		} else
		{	return n + sum(n - 1); // recursive call
		}
	}
	
	public static int sum1(int n)
	{
		//System.out.println(">>> " + n); // uncomment this line to see how N changes as the method is called recursively
		if ( n <= 1 )			// base case, we need it for n=0!!!
		{	return 1;
		} else
		{	return n + sum(n - 1); // recursive call
		}
	}
	
	public static void main(String[] args)
	{	// IBIO.output()
		System.out.println( "sum1(0) = " + sum1(0) );
		// sum(0) causes an error because the original algorithm does not provide a (base) case for n=0
		// this error is infinite recursion; Java runs out of memory when keeping track of too many recursive calls
		System.out.println();
		System.out.println( "sum(1) = " + sum(1) );
		System.out.println();
		System.out.println( "sum(2) = " + sum(2) );
		System.out.println();
		System.out.println( "sum(8) = " + sum(8) );
		System.out.println();
		System.out.println( "sum1(10) = " + sum1(10) );
		//System.out.println(Math.sqrt(144));
	}
}

/*	( this is a multi-line comment) 
 * 	IBIO.output()	is the same as System.out.println();
 * 	IBIO.out()		is the same as System.out.print();
 */
