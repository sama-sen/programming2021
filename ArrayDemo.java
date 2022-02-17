/*
 * ArrayDemo.java
 */


public class ArrayDemo {
	
	public static void printArray(int[] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			System.out.println(index + " : " + a[index]);
		}
	}
	
	public static void main (String[] args) {
		int[] array = new int[5];
		printArray(array);
		for(int i = 0; i < array.length; i++)
		{
			array[i] = IBIO.inputInt("enter an int ");
		}
		printArray(array);
	}
}

