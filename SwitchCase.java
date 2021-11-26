
public class SwitchCase
{
	
	public static void main(String args[])
	{
		int num = IBIO.inputInt("enter a number ");
		switch (num)
		{
			case 1:
				IBIO.output("that number was 1");
				break;
			case 2:
				IBIO.output("that number was 2");
				break;
			case 3:
				IBIO.output("that number was 3");
				break;
			default:
				IBIO.output("that number was neither 1 nor 2 nor 3");
				break;
		} // end of switch statement
	}
}

