

public class WhileDemo2
{
	
	public static void main (String[] args)
	{
		int x;
		do
		{
			x = IBIO.inputInt("Enter a number less than 100: ");
		} while(x >= 100);
		System.out.println("Thanks");
	}
}

