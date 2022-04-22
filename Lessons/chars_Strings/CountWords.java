
public class CountWords
{
	public static int mysterio(String s)
	{
		int result = 1;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ' ') // single space
			{ result++;
			}
		}
		return result;
	}

	public static void main (String[] args)
	{
		String s = IBIO.input("Enter a sentence ");
		System.out.println(s + " has " + mysterio(s) + " words.");
	}
}

