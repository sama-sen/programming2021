public class MockTest
{
	
	public static void main (String[] args) 
	{
		IBIO.output("Marcos Drien");
		int max = 0;
		int min = 0;
		double sum = 0;
		int howMany = IBIO.inputInt("How many numbers to process? ");
		if(howMany < 3)
		{	IBIO.output("Input error");
			//System.exit(1);
		}
		if(howMany >= 3)
		{
			for(int i = 0; i < howMany; i++) // repeat N times
			{
				int number = IBIO.inputInt("Enter a number: ");
				if(i==0) // the first time the loop runs, i is 0
				{	max = number;	// we set the maximum to be the first number we input
				}
				if(number > max)
				{	max = number;
				}
			}
			IBIO.output("Maximum = " + max);
		}
		
		
		IBIO.output("[End]"); // outside the loop, happens only once
	}
}

