/*
 * Pr7_2.java
 * Change the program above so that decimal places line up. To do this you must change the decimal answer xx into a string (String yy = "" + xx;). Then use the command yy.indexOf('.') to find the position the decimal place is in the string. eg if String yy = "47.29"; then yy.indexOf('.') will be 2. Remember that counting starts from 0. Then add enough spaces at the start to line up the number.
 * 
 * 
 */


public class Pr7_2
{
	public static String rightAlign(double n, int width)
	{
		String st = "" + n; // make a string of the number
		while (st.indexOf('.') < width) // st.length()=how many characters are in st
		{	st = " " + st; // add spaces in front of the number
		}
		return st;
	}
	
	public static double format(double x, int decimals)
	{
		int factor = (int)Math.pow(10, decimals);
		int number = (int)(x * factor);
		double result = (double)number / factor;			
		return result;
	}
	
	public static void main (String[] args)
	{
		double xx = 1;
		for (int i = 0; i < 10; i++)
		{	xx = xx * 3.732;
			xx = format(xx, 3);
			//System.out.printf("%,10.3f\n", xx);
			IBIO.output( rightAlign(xx, 6) );
		}
		
	}
}

