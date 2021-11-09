
public class Fibonacci2
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");
		int maxTerm;
		
		do
		{
			long first  = 0;
			long second = 1;
			long term = first + second;
			double average = first + second + term;
			do
			{	maxTerm = IBIO.inputInt("Calculate up to which term of the Fibonacci sequence? ");
				if(maxTerm < 0)
				{	IBIO.output("ERROR-input must be >= 0!");
				}
			} while( maxTerm < 0 );
			if( maxTerm != 0 )
			{
				if( maxTerm <= 20 )
				{
					//IBIO.out(first);
					IBIO.out(first + "; " + second + "; ");
					if( maxTerm > 1 )
					{
						for(int i = 2; i <= maxTerm; i++)
						{
							term = first + second;
							IBIO.out( term );
							average = average + term;
							if( i < maxTerm )
							{	IBIO.out("; ");
							}
							first = second;
							second = term;
						}
					}
				} else
				{
					for(int i = 2; i <= maxTerm; i++)
					{
						term = first + second;
						average = average + term;
						first = second;
						second = term;
					}
					IBIO.output( term );
					
				}
				IBIO.output("\nAverage: " + (average / maxTerm) );
				long t = term;
				int digits = 0;
				while( t > 0 )
				{	t = t / 10;
					digits++;
				}
				IBIO.output( "Digits:" + digits );
			}
			
		} while(maxTerm != 0);
	}
}

