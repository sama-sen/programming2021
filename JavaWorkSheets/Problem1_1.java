// demonstration of for loops
public class Problem1_1
{
	
	public static void main (String[] args)
	{
		int times = IBIO.inputInt("How many times? ");
		IBIO.output("3 names repeated 3 times (alternating)");
		for(int i = 0; i < times; i++)
		{
			IBIO.output("Alishba");
			IBIO.output("Luigi");
			IBIO.output("Daniel");
		}
		IBIO.output("3 names repeated 3 times in sequence");
		for(int i = 0; i < times; i++)
		{
			IBIO.output("Alishba");
		}
		for(int i = 0; i < times; i++)
		{
			IBIO.output("Luigi");
		}
		for(int i = 0; i < times; i++)
		{
			IBIO.output("Daniel");
		}
		
	}
}

/*
Alishba
Luigi
Daniel
Alishba
Luigi
Daniel
Alishba
Luigi
Daniel

Alishba
Alishba
Alishba
Luigi
Luigi
Luigi
Daniel
Daniel
Daniel
*/
