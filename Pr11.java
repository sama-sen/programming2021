
public class Pr11
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("time? ");
		String nickname = IBIO.input("Nickname: ");
		for(int i = 0; i < n; i++) // i++ means i = i+1
		{
			IBIO.out( i + "\t: My name :)\t" + nickname);
			IBIO.output( "\t i<n? " + (i<n) );
		}
	}
}

