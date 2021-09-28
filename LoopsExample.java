public class LoopsExample
{
	// <-- comment; for people, Java ignores it
	public static void main (String[] args)
	{
		int times = IBIO.inputInt("How many times? ");
		for(int i = 0; i < times; i++) // repeats "times" times...
		{	// start of code to be repeated
			IBIO.output("Hello");
			//IBIO.output("Bye");
		}	// end of code to be repeated
		IBIO.output("Bye");
		
	}
	
}

