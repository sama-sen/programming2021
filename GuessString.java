/*
 * Guess the string
 * 
 * 
 */


public class GuessString
{
	
	public static void printArray(char[] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			System.out.println(index + " : " + a[index]);
		}
	}
	
	public static void main (String[] args)
	{
		String guessMe = "aardvark";
		char[] letters = new char[26];
		int i = 0;
		for (char c = 'a'; c <= 'z'; c++)
		{
			letters[i] = c;
			i++;
		}
		//printArray(letters);
		for(int l = 0; l < guessMe.length(); l++)
		{	char x = guessMe.charAt(l);
			for(int n = 0; n < letters.length; n++)
			{
				//System.out.print( letters[n] );
				if( letters[n] == x )
				{	System.out.println( ">" + letters[n] );
					break;
				}
			}
		}
	}
}

