/*
 * ArrayDemo.java
 */


public class ArrayDemo {
	
	public static void listArray(int[] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			System.out.println(index + " : " + a[index]);
		}
	}
	
	public static void printArray(int[] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			System.out.print( a[index] );
			if( index < a.length-1 )
			{	 System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		
		int[] array;
		int size = IBIO.inputInt("Enter array size = ");
		array = new int[size];
		printArray(array);
		for(int i = 0; i < array.length; i++)
		{
			array[i] = IBIO.inputInt("enter an int ");
		}
		printArray(array);
	}
}

