// slightly modified and expanded
public class Pr1_1
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("How many times? ");
		String nickname = IBIO.input("Nickname: ");
		int i; // just a declaration
		// the line below repeats the code between { } n times
		for(i = 0; i < n; i++) // i++ means i = i+1
		{
			IBIO.out( i + "\t: My name :)\t" + nickname);
			IBIO.output( "\t i<n? " + (i<n) );
		}
		IBIO.output(i + "\t i<n? " + (i < n) );
		
		// original problem answer below
		IBIO.output("Original Problem 1.1=======");
		int x = IBIO.inputInt("How many times? ");
		for(int t = 0; t < x; t++) // repeats the code below between {} t times
		{	IBIO.output("Juanita");
		}

	}
}

