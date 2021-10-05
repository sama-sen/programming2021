
public class ForLoopExample
{
	
	public static void main (String[] args)
	{
		IBIO.out("Counting up: ");
		for(int i = 1; i <= 10; i++) // repeats 10 times, i counts
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\nEND");
		
		IBIO.out("Counting down: ");
		for(int i = 10; i > 0; i--) // repeats 10 times, i counts
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\nEND");
		
		IBIO.out("Counting up in steps of 3: ");
		for(int i = 0; i < 20; i = i + 3)
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\nEND");
		
		IBIO.out("Counting up in steps of 3: ");
		for(int i = 20; i > 0; i = i - 3)
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\nEND");
	}
}

