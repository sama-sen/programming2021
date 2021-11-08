public class Triangular
{
	public static int triangular(int term)
	{
		if(term <= 1)
		{	return 1;
		} else
		{	return term + triangular( term - 1 );
		}
	}
	
	public static int tri(int term)
	{
		return term * (term + 1) / 2;
	}
	
	
	public static void main (String[] args)
	{
		for(int i = 1; i < 101; i++)
		{
			System.out.println( "Term " + i + " = " + triangular( i ) );
		}
		System.out.println( "Term 1,000 = " + triangular( 1000 ) );
		int n = 1000;
		int t = n*(n+1) / 2;
		System.out.println( "Term 1,000 = " + t );
	}
}

