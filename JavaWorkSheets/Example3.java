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
		IBIO.out("The product of " + a);	// same line
		IBIO.out(" and " + b);				// same line
		IBIO.output(" is " + c);		// same line, goes next line
		IBIO.output("the end.");
		IBIO.output("Why are you still here?");
	}
}

