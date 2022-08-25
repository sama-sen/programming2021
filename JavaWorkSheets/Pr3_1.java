
public class Pr3_1
{
	
	public static void main (String[] args)
	{
		int x;
		do
		{
			x = IBIO.inputInt("Enter a number less than 100: ");
		} while( x % 2 != 0 || x <= 0 || x >= 100 );
		/* the above translated from the requirements of
		 * having the input accpeted when it's even and
		 * greater than 0 and less than 100
		 */
		IBIO.output("Thanks. " + x);
	}
}

