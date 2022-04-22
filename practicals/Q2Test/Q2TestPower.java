public class Q2TestPower
{
	public static void main(String[] args)
	{
		long power;
		int base;
		int exponent;
		double negativePower;

		IBIO.output("Marcos Drien");
		do
		{
			power = 1;
			IBIO.output("\nX to the power of Y");
			IBIO.output("===================\n");
			base = IBIO.inputInt("Enter the base     = ");
			if( base != 0 )
			{
				exponent = IBIO.inputInt("Enter the exponent = ");
				IBIO.out( "\n" + base + " to the power of " + exponent + " = " );

				if( exponent < 0 )			// NEGATIVE EXPONENT
				{	exponent = exponent * -1;
					for(int i = 0; i < exponent; i++)
					{	power = power * base;
					}
					negativePower = 1.0 / power;
					// calculate how many characters in the denominator of fraction
					int b = base; int e = exponent; // we keep the original variables intact
					int denominatorLength = 0;
					while(b > 0)
					{	b = b / 10;
						denominatorLength++;
					}
					while(e > 0)
					{	e = e / 10;
						denominatorLength++;
					}
					denominatorLength++; // to account for the ^ character
					IBIO.output("\n"); // go to next-next line
					for(int i = 1; i <= denominatorLength/2; i++) // put spaces...
					{	IBIO.out(" "); // ...before the "1"
					}
					IBIO.output("1");
					for(int i = 1; i <= denominatorLength; i++) // put line...
					{	IBIO.out("-");   // ...under the "1"
					}
					IBIO.output(" = ");  // add the "=" and go to next line
					IBIO.output(base + "^" + exponent);

					denominatorLength = 0; // count again for power result length
					long p = power; // we need power variable for the result, keep intact
					while( p > 0 )
					{	p = p / 10;
						denominatorLength = denominatorLength + 1;
					}
					IBIO.output("\n"); // go to next-next line
					for(int i = 1; i <= denominatorLength/2; i++) // put spaces...
					{	IBIO.out(" "); // ...before the "1"
					}
					IBIO.output("1");
					for(int i = 1; i <= denominatorLength; i++) // put line...
					{	IBIO.out("-");   // ...under the "1"
					}
					IBIO.output(" = " + negativePower);  // add the "=" and go to next line
					IBIO.output(power);

				}		// end if --> exponent is negative.
				else	// this could also be: if(exponent >= 0)
				{
					for(int i = 0; i < exponent; i++)
					{	power = power * base;
					}
					IBIO.output( power );
				} // end else
			}
			else		// this could also be: if(base == 0)
			{
				IBIO.output("Base is zero. Nothing to do.");
			}
		} while( base != 0 );

		IBIO.output("\n>Program end.\n"); // "\n" = go to next line
	}
}
