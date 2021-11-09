
public class Fibonacci
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");
		long first  = 0;
		long second = 1;
		long term;
		int maxTerm;
		double average = first+second;
		do
		{	maxTerm = IBIO.inputInt("Calculate up to which term of the Fibonacci sequence? ");
			if(maxTerm < 0)
			{	IBIO.output("ERROR-input must be >= 0!");
			}
		} while( maxTerm < 0 );
		if( maxTerm <= 20 )
		{	IBIO.out(first);
		}
		if( maxTerm >= 1 && maxTerm <= 20 )
		{	IBIO.out("; " + second);
		}
		if( maxTerm > 1 )
		{	for(int i = 2; i < maxTerm; i++)
			{
				term = first + second;
				average = average + term;
				if(maxTerm <= 20)
				{	IBIO.out("; " + term);
				}
				first = second;
				second = term;
			}
		}
		term = first + second;
		IBIO.output("; " + term);
		average = average + term;
		IBIO.output("Average of terms sum = " + (average/maxTerm) );
		long t = term;
		int digits = 0;
		while( t > 0 )
		{	t = t / 10;
			digits++;
		}
		IBIO.output( "Digits:" + digits );
	}
}

