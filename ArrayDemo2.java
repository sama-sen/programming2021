/*
 * ArrayDemo.java
 * Array of Strings
 */


public class ArrayDemo2 {
	
	public static void listArray(String[] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			if(a[index] != null)
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
	
	public static void main (String[] args) {
		String[] array; // <= declaration only
		int size = IBIO.inputInt("Enter array size = ");
		array = new String[size]; // initialisation/instantiation
		printArray(array);
		for(int i = 0; i < array.length; i++)
		{
			array[i] = IBIO.input("enter a String ");
		}
		printArray(array);
		String[] a2 = { "Joe", null, "Anne" };
		printArray(a2);
		listArray(a2);
	}
}

