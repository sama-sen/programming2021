
public class StringDemo2
{
	
	public static void listArray(String[] a)
	{
		int index = 0;
		//for(int index = 0; index < a.length; index++)
		{
			while(a[index] != null)
			{	System.out.println(index + " : " + a[index]);
				index++;
			}
		}
	}
	
	public static void main (String[] args)
	{
		String[] stringArray = new String[5];
		stringArray[0] = "Juan";
		stringArray[1] = "Maria";
		String h = "hola";
		String i = new String("hola");
		System.out.println( "h = " + h );
		System.out.println( "i = " + i );
		System.out.println( "h == i : " + (h == i) );
		System.out.println( "h.equals(i) = " + h.equals(i) );
		// h.compareTo(i) = 0 if Strings h and i are the same (content)
		System.out.println( "h.compareTo(i) = " + h.compareTo(i) );
		System.out.println("--stringArray contents--");
		listArray( stringArray );
		System.out.println("----");
		// < 0 if Strings stringArray[0] and stringArray[1] are in alphabetical order (A-Z)
		System.out.println( "stringArray[0].compareTo(stringArray[1]) = " + stringArray[0].compareTo(stringArray[1]) );
		// use compareToIgnoreCase and equalsIgnoreCase to avoid lower case being > upper case in order
		// > 0 if Strings stringArray[0] and stringArray[1] are in REVERSE alphabetical order (Z-A)
		System.out.println( "stringArray[1].compareTo(stringArray[0]) = " + stringArray[1].compareTo(stringArray[0]) );
		
	}
}

