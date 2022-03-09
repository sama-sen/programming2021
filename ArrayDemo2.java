/*
 * ArrayDemo.java
 * Array of Strings
 */


public class ArrayDemo2
{
	
	public static void listArray(String[] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			//if(a[index] != null)
			{	System.out.println(index + " : " + a[index]);
			}
		}
	}
	
	public static void printArray(String[] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			if(a[index] != null)
			{	
				System.out.print( a[index] );
				if( index < a.length-1 )
				{	 System.out.print(", ");
				}
			}
		}
		System.out.println();
	}
	
	public static boolean equal(String[] a, String[] b)
	{
		if(a.length != b.length)
		{	return false;
		}
		for(int i = 0; i < a.length; i++)
		{	if(a[i] != b[i])
			{	return false;
			}
		}
		return true;
	}
	
	public static void main (String[] args)
	{
	/*	String[] array; // <= declaration only
		int size = IBIO.inputInt("Enter array size = ");
		array = new String[size]; // initialisation/instantiation
		printArray(array);
		listArray(array);
		for(int i = 0; i < array.length; i++)
		{
			array[i] = IBIO.input("enter a String ");
		}
		printArray(array);
	*/
		String[] a2 = { "", "Joe", null, "Anne" };
		String[] b  = { "", "Joe", null, "Anne" };
		System.out.println( a2.equals(b) );
		System.out.println( a2 == b );
		System.out.println( a2 );
		System.out.println( b );
		printArray(a2);
		listArray(a2);
		System.out.println( a2[0].equals(a2[2]) );
		String h1 = "Hola";
		String h2 = new String("Hola");
		System.out.println( h1.equals(h2) );
		System.out.println( h1 == h2 );
		String[] b2 = { "Pepe", "Jose", "Maria", "Ana" };
		String[] b3 = { "Pepe", "Jose", "Maria", "Ana" };
		System.out.println(b2.equals(b3));
		System.out.println(equal(b2, b3));
	
	}
}

