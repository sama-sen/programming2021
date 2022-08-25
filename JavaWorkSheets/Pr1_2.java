
public class Pr1_2
{
	
	public static void main (String[] args)
	{	// declare and initialise/input variables
		int steps  = IBIO.inputInt("Steps: ");
		int start  = IBIO.inputInt("Start: ");
		int inc    = IBIO.inputInt("Increment: ");
		int number = start;
		for(int i  = steps; i > 0; i--) // countdown from (the value of) "steps"
		{
			IBIO.out(number + " ");
			number = number + inc;
		}
		
		IBIO.output("");
		number = start; // we need to re-initialise number to re-calculate/re-do the problem in a different way
		for(int i = 0; i < steps; i++) // repeat "steps" number of times
		{
			IBIO.out(number + " ");
			number = number + inc;
		}
		IBIO.output("");
		
		// this is more closely related to the pseudocode algorithms that we have been tracing:
		int counter = 0;
		number = start;
		while(counter < steps) // <- not part of our first practical programming test, just to compare with the previous solution
		{	IBIO.out(number + " ");
			number = number + inc;
			counter = counter + 1;
		}
		// 3 diffrerent
	}
}

