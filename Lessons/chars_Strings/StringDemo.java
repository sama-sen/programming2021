/*
 * StringDemo.java
 * Just getting started with Strings and extracting characters from them
 * with charAt()
 */


public class StringDemo
{
	
	public static void main (String[] args)
	{
		String salutation = "Ms";
		String givenName  = "Presidenta";
		String surname    = "OFS";
		salutation = salutation.charAt(0) + "is" + salutation.charAt(1);
		System.out.
		println( salutation + " " + givenName + " " + surname);
	}
}

