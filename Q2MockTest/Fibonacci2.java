
public class Fibonacci2
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");
		int first  = 0;
		int second = 1;
		int term = 0;
		int maxTerm;
		do
		{	maxTerm = IBIO.inputInt("Calculate up to which term of the Fibonacci sequence? ");
			if(maxTerm < 0)
			{	IBIO.output("ERROR-input must be >= 0!");
			}
		} while( maxTerm < 0 );
		if( maxTerm <= 20 )
		{
			IBIO.out(first);
			if( maxTerm >= 1 )
			{	IBIO.out("; " + second + "; ");
			}
			if( maxTerm > 1 )
			{	for(int i = 2; i <= maxTerm; i++)
				{
					term = first + second;
					IBIO.out( term );
					if( i < maxTerm )
					{	IBIO.out("; ");
					}
					first = second;
					second = term;
				}
			}
		} else {
			for(int i = 2; i <= maxTerm; i++)
			{
				term = first + second;
				first = second;
				second = term;
			}
			IBIO.out( term );
		}
	}
}

