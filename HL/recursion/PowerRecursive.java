import java.util.Scanner;

public class PowerRecursive
{
	public static double power(int base, int ebaseponent)
	{
		if( ebaseponent == 0 )
		{	return 1;
		}
		else if( ebaseponent == 1)
		{	return base;
		}
		else
		{	return base * power(base, ebaseponent - 1);
		}
	}
	
	

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Base = ");
		int base = input.nextInt();
		System.out.print("Exponent = ");
		int exponent = input.nextInt();
		if(exponent < 0)
		{	System.out.println( "\n"+base+" ^ "+exponent+" = "+ (1/power(base,-exponent)) );
		} else {
			System.out.println( "\n"+base+" ^ "+exponent+" = "+power(base,exponent) );
		}
	}
}
