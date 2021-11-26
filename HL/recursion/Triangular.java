/* Triangular sequence - recursive version
 * 
 * https://www.mathsisfun.com/algebra/triangular-numbers.html
 * 
 */

public class Triangular
{
	public static int triangular(int n)
	{
		if( n == 0 )
		{	return 0;
		} else if( n == 1 )
		{	return 1;
		} else {
			return // your code goes here //
			;
		}
	}
	
	public static void main(String[] args)
	{	// IBIO.output()
		System.out.println( "triangular(0) = " + triangular(0) );
		// triangular(0) causes an error because the original algorithm does not provide a (base) case for n=0
		// this error is infinite recursion; Java runs out of memory when keeping track of too many recursive calls
		System.out.println();
		System.out.println( "triangular(1) = " + triangular(1) );
		System.out.println();
		System.out.println( "triangular(2) = " + triangular(2) );
		System.out.println();
		System.out.println( "triangular(8) = " + triangular(8) );
		System.out.println();
		System.out.println( "triangular(10) = " + triangular(10) );
		//System.out.println(Math.sqrt(144));
	}
}

/*

triangular(0) = 0

triangular(1) = 1

triangular(2) = 3

triangular(8) = 36

triangular(10) = 55

*/
