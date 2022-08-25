/*
 * Chapter 6 example
 * 
 */


public class Ch6
{
	// returns a String with howMany number of spaces
	public static String spaces(int howMany)
	{
		String s = ""; // initialise String s to empty
		for(int i = 0; i < howMany; i++)
		{
			s = s + " ";
		}
		return s;
	}
	
	// returns a String with howMany number of *
	public static String stars(int howMany)
	{
		String s = ""; // initialise String s to empty
		for(int i = 0; i < howMany; i++)
		{
			s = s + "*";
		}
		return s;
	}
	
	
	public static void main (String[] args)
	{
		int num = IBIO.inputInt("enter number of lines ");
		String line = stars(num);
		for (int i = 0; i < num; i++)
		{
			IBIO.output(spaces(num) + line);
		}
	}
}

/*

enter number of lines 5
*****
*****
*****
*****
*****

*/
