
public class Fibonacci
{
	
	public static void main (String[] args)
	{
		int maxTerm;
		IBIO.output("Marcos Drien");
		do
		{
			long first  = 0;
			long second = 1;
			long term = first + second;
			double average = term;
			do
			{	maxTerm = IBIO.inputInt("Calculate up to which term of the Fibonacci sequence? ");
				if(maxTerm < 0)
				{	IBIO.output("ERROR-input must be >= 0!");
				}
			} while( maxTerm < 0 );
			if( maxTerm > 0 )
			{
				if( maxTerm <= 20 )
				{	IBIO.out(first + "; " + second);
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
					term = first + second; //calculate last term
					if(maxTerm <= 20)
					{	IBIO.out("; ");
					}
				}
			
				if(maxTerm > 1)
				{	IBIO.output(term);
					average = average + term;
				} else {
					IBIO.output(""); // go to next line if 1 term only
				}
				IBIO.output("Average of terms sum = " + (average/maxTerm) );
				long t = term;
				int digits = 0;
				while( t > 0 )
				{	t = t / 10;
					digits++;
				}
				IBIO.output( "Digits:" + digits );
			} // if maxTerm > 0
		} while(maxTerm > 0);
	}
}

