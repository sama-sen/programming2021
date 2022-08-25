/*
 * Chapter 6B example
 * 
 */


public class Ch6B
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
			s = s + "* ";
		}
		return s;
	}
	
	
	public static void main (String[] args)
	{
		int num = IBIO.inputInt("enter number of lines ");
		for (int i = 0; i < num; i++)
		{
			IBIO.output( stars(i+1).trim() );
		}
		String name = "Pepe Perez";
		for(int i = 0; i < name.length(); i++)
		{	System.out.print( name.charAt(i) + " " );
		}
		System.out.print(name.equals("Pepe Perez "));
		System.out.println("\n\nProblem 6.3\n");
		for(int i = num; i > 0; i--)
		{	System.out.println( spaces(i) + stars(num) );
		}
		for(int i = 0; i <= num; i++)
		{	System.out.println( spaces(i) + stars(num) );
		}
	}
}

/*

enter number of lines 5


*/
