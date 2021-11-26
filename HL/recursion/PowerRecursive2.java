import java.util.Scanner;

public class PowerRecursive2
{
	public static double pow(int base, int exponent)
	{
		if( exponent == 0 )
		{	return 1;
		}
		else if( exponent == 1)
		{	return base;
		}
		else
		{	return base * power(base, exponent - 1);
		}
	}
	
	public static double power(int base, int exponent)
	{
		if(exponent < 0)
		{	return 1/pow(base, -exponent);
		} else {
			return pow(base, exponent);
		}
	}
	

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Base = ");
		int base = input.nextInt();
		System.out.print("Exponent = ");
		int exponent = input.nextInt();
		System.out.println( "\n"+base+" ^ "+exponent+" = "+power(base,exponent) );
		
	}
}
