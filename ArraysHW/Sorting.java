/* Sorting algorithms formative assessment
 * 
 * Student Name: 
 * 
 * April/2021
 * 
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 * 
 * Also check https://visualgo.net/en/sorting 
 */
public class Sorting
{
	public static void printArray(int[] array)
	{
		for( int e: array )
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static int[] clone(int[] array) // returns a copy of array
	{
		if(array.length == 0) return null;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	static void bubble(int[] a)
	{	int c = 0;
		for(int i = 0; i < a.length; i++)
		{	for(int j = 0; j < a.length - 1; j++)
			{	// if=comparisons
				c++;
				if(a[j] > a[j+1])
				{	// swap elements not in order (ascending)
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					System.out.print("\t>>> "); printArray(a); // shows swaps in array
				}
			}
		}
		System.out.println("Comparisons: " + c);
	}
	
	static void betterBubble(int[] a)
	{	int c = 0;
		for(int i = 0; i < a.length; i++)
		{	// avoid checking sorted end of the array
			for(int j = 0; j < a.length - i - 1; j++)
			{	c++;
				if(a[j] > a[j+1])
				{	int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					System.out.print("\t>>> "); printArray(a);
				}
			}
		}
		System.out.println("Comparisons: " + c);
	}
	
	static void bestBubble(int[] a)
	{	int c = 0;
		boolean swapped = true;
		for(int i = 0; i < a.length && swapped; i++)
		{	swapped = false;
			// avoid checking sorted end of the array
			for(int j = 0; j < a.length - i - 1; j++)
			{	c++;
				if(a[j] > a[j+1])
				{	int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
					System.out.print("\t>>> "); printArray(a);
				}
			}
		}
		System.out.println("Comparisons: " + c);
	}

	public static void selection(int[] a)
	{
		// your code goes here - sort the array a using selection sort
	}

	// a couple of ways to visualise the insertion sort:
	// https://youtu.be/OGzPmgsI-pQ
	// https://youtu.be/JU767SDMDvA
	public static void insertionSort(int[] array)
	{
		int len = array.length;
		for(int i = 1; i < array.length; i++)
		{
			int temp = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > temp)
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
			System.out.print("\t>>> ");
			printArray(array);
		}
		// return array; optional-used only if the signature
		// is: public static int[] insertionSort(int[] a...)
	}
	
	public static int linearSearch(int[] array, int key)
	{
		int location = -1;	// not found
		for(int i = 0; i < array.length; i++)
		{
			if(key == array[i])
			{
				location = i;
				break;
			}
		}
		return location;
	}

	public static int binarySearch(int[] array, int key)
	{
		int location = -1;	// not found
		int index = 0;		// index of element being checked
		boolean found = false; // flag to continue or stop searching
		int low = 0;		// index of lowest element to check
		int high=array.length; // index of last element to check
		
		// your code here
		return location;
	}

	// No need to modify the main method.
	public static void main(String[] args)
	{
		int[] original = { 7,9,6,8,1,3,5,2,4 };
		int[] array = clone(original);
		System.out.println("Original array");
		printArray(original);

		System.out.println("\nBubble sort");
		bubble( array );
		printArray(array);
		System.out.println();
		
		System.out.println("\nOptimised Bubble sort");
		betterBubble( array );
		printArray(array);
		System.out.println();
		
		System.out.println("\nEarly exit optimised Bubble sort");
		bestBubble( array );
		printArray(array);
		System.out.println();

		System.out.println("\nSelection sort");
		array = clone(original);
		selection( array );
		printArray(array);

		System.out.println("\nInsertion sort");
		array = clone(original);
		insertionSort( array );
		printArray(array);

		System.out.print("Enter element to search for: ");
		int key = input.nextInt();
		System.out.println("Linear search");
		int location = linearSearch(sorted, key);
		if(location == -1)
		{
			System.out.println(key + " not found.");
		} else {
			System.out.println(key + " found @ index " + location);
		}
		
		System.out.println("\nBinary search");
		int index = binarySearch(selection, key);
		if(index == -1)
		{
			System.out.println(key + " not found.");
		} else {
			System.out.println(key + " found @ index " + index);
		}
	}
}
