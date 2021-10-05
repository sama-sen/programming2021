public class IfDemo
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("Enter a number: ");
		IBIO.out(n + " is ");
		if(n < 0)
		{	IBIO.out("NEGATIVE");
		} else if(n > 0)
		{	IBIO.out("POSITIVE");
		} else
		{	IBIO.out("ZERO");
		}
		IBIO.out(" and it is ");
		if(n % 2 == 0)
		{	IBIO.output("Even");
		}	else
		{	IBIO.output("Odd");
		}
		
		if(n != 0)
		{	main(null);
		}
		
		IBIO.output("[END]");
	}
}

