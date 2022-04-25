import java.util.Arrays;
/*
 * ArraysDemo.java
 * 
 * 
 */


public class ArraysDemo
{
	static final int SIZE = 5;
	
	public static void printArray(double[] a)
	{
		System.out.println(a);
		for(int i = 0; i < a.length; i++)
		{	System.out.println(i + " : " + a[i]);
		}
	}

	/* // alternative for loop way of traversing an array
	public static void printArray(double[] arrayOfDoubles)
	{
		for(double x : arrayOfDoubles) // enhanced for loop
		{	System.out.println(x);
		}
	} */
	
	
	
	public static void main (String[] args)
	{
		double[]                                                              doublesArray;
		//System.out.println(doublesArray); // Error-doublesArray not initialised!
		double[] nums = new double[SIZE];
		double[] whatever = { 1.1, 2.2, 3.3, 4.4 };
		
		//System.out.println(Arrays.toString(nums)); // not recommended for our IB course!
		System.out.println("nums" + nums);
		printArray(nums);
		System.out.println("\nwhatever array" + whatever);
		printArray(whatever);
		doublesArray = whatever;
		
		printArray(doublesArray);
		System.out.println(" > whatever[0] = 791;");
		whatever[0] = 791;
		printArray(whatever);
		printArray(doublesArray);
	}
}


/*

[D@5acf9800

0 : 0.0
1 : 0.0
2 : 0.0
3 : 0.0
4 : 0.0

*/
