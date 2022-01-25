/*
 * Pr7_2.java
 * Change the program above so that decimal places line up. To do this you must change the decimal answer xx into a string (String yy = "" + xx;). Then use the command yy.indexOf('.') to find the position the decimal place is in the string. eg if String yy = "47.29"; then yy.indexOf('.') will be 2. Remember that counting starts from 0. Then add enough spaces at the start to line up the number.
 * 
 * 
 */


public class Pr7_2
{
	// align a double (s) to the right of (width) spaces
	public static String rightAlign(double n, int width)
	{
		String st = "" + n; // make a string of the number
		while (st.indexOf('.') < width) // st.length()=how many characters are in st
		{	st = " " + st; // add spaces in front of the number
		}
		return st;
	}
	
	// here we use casting a lot to convert Math.pow (which returns a double) to an int (we don't need a double)
	// and to truncate the number of decimals in a double
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
			xx = format(xx, 2);
			
			// https://www.journaldev.com/28692/java-printf-method ,  https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
			//System.out.printf("%,10.2f\n", xx); // Java's built-in way to align and format output
			// 10 width because of 6 digits + the comma for thousands, the decimal . and 2 decimals
			
			IBIO.output( rightAlign(xx, 6) );
		}	
	}
}

/* output 1: IBIO.output( rightAlign(xx, 6) );
     3.73
    13.92
    51.94
   193.84
   723.41
  2699.76
 10075.5
 37601.76
140329.76
523710.66

** output 2: System.out.printf("%,10.2f\n", xx);
      3.73
     13.92
     51.94
    193.84
    723.41
  2,699.76
 10,075.50
 37,601.76
140,329.76
523,710.66

*/
