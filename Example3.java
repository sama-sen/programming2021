/*
 * Java-Arithmetic operations
 * addition: +
 * ( + also concatenates "glues" text and variables)
 * subtraction: -
 * multiplication: *
 * division: /
 * modulo: %
 ***********************************************************/
public class Example3
{
	
	public static void main (String[] args)
	{
		int a = IBIO.inputInt("Enter a number: ");
		int b = IBIO.inputInt("Enter another number: ");
		int c = a * b;
		IBIO.output("The product of " + a + " and " + b + " is " + c);
		
	}
}

