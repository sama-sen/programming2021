/*
 * 
 * 
 */


public class Ch7
{
	
	public static String rightAlign(int n, int width)
	{
		String st = "" + n; // make a string of the number
		while (st.length() < width) // st.length()=how many characters are in st
		{	st = " " + st; // add spaces in front of the number
		}
		return st;
	}
	
	public static void main (String[] args)
	{
		final int MAXWIDTH = 10;
		for(int i = 1; i <= 20; i++)
		{
			//IBIO.output(i + " " + i*i + " " + i*i*i);
			String s = rightAlign(i, MAXWIDTH) + rightAlign(i*i, MAXWIDTH) + rightAlign(i*i*i, MAXWIDTH);
			IBIO.output(s);

		}
		
		String pi = "" + ( (int)(Math.PI*100)/100.0 );
		System.out.println(pi);
		System.out.println( pi.length() );
	}
}

