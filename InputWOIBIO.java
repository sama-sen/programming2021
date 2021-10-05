/*
 * Input without IBIO example
 */
import java.util.*;

public class InputWOIBIO
{
	
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int number = in.nextInt();
		System.out.println("Input number was " + number);
		
		System.out.print("Input a double: ");
		double decimal = in.nextDouble();
		System.out.println("Input number was " + decimal);
		
		String s = in.nextLine(); // only needed because we previously input a number
		System.out.print("Input a String: ");
		s = in.nextLine();
		
		System.out.println("The string was " + s);
		in.close();
	}
}

