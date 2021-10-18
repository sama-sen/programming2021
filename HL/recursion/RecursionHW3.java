
public class RecursionHW3
{
	// recursive (the method calls itself)
	public static int mystery(int n, int a, int d)
	{
		System.out.println( "N= " + n + "\tA= " + a + "\tD=" + d + "\tN==1? " + (n == 1) ); // tracing
		if (n == 1)
			return a;
		else
			return d + mystery(n - 1, a, d);
	}
	
	// iterative (with loop)
	public static int mystery2(int n, int a, int d)
	{	// here, i replaces n; n does not change
		int total = 0;
		for(int i = n; i >= 1; i--)
		{
			if( i == 1 )
			{	total = total + a;
			} else 
			{	total = total + d;
			}
			IBIO.output( "N (i) = " + i + "\tA= " + a + "\tD=" + d + "\tTotal = " + total + "\tN (i) == 1? " + ( i == 1 ) );
		}
		return total;
	}
	
	public static void main(String[] args)
	{
		IBIO.output( "\nRecursive version");
		IBIO.output( mystery(3,2,6) );  // recursive version
		IBIO.output( "\nIterative/loop version");
		IBIO.output( mystery2(3,2,6) ); // iterative (loop) version
		/*
		IBIO.output( 2 >= 6 ); // > < >= <= == !=
		IBIO.output( 6 >= 2 ); // boolean operators && ||
		*/
	}
	
}

