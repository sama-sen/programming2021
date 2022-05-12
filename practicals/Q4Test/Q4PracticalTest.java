/* Sorting algorithms 
 * 
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 * 
 * Also check https://visualgo.net/en/sorting 
 */
import java.util.Scanner;

public class Q4PracticalTest
{
	public static void printArray(String[] array)
	{
		System.out.print(array[0]);
		for( int i = 1; i < array.length; i++ )
		{	System.out.print( ", " + array[i] );
		}
		System.out.println();
	}
	
	public static String[] clone(String[] array) // returns a copy of array
	{
		if(array.length == 0)
		{	return null;
		}
		String[] copy = new String[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	
	static void bubble(String[] a)
	{
		boolean swapped = true;
		for(int i = 0; i < a.length && swapped; i++)
		{	swapped = false;
			// avoid checking sorted end of the array
			for(int j = 0; j < a.length - i - 1; j++)
			{
				if(a[j].compareTo(a[j+1]) > 0)
				{	String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}
		}
	}
	
	public static void selection(String[] a)
	{
		int max;
		String temp;
		for ( int i = 0; i < a.length - 1; i++ )
		{
			max = i;
			for(int j = i + 1; j < a.length; j ++)
			{
				if( a[ j ].compareTo(a[max]) > 0)
				{	max = j;
				}
			}
			temp = a[ max ];
			a[ max ] = a[ i ];
			a[ i ] = temp;
		}
	}
	
	public static int linearSearch(String[] array, String key)
	{
		int location = -1;	// not found
		for(int i = 0; i < array.length; i++)
		{
			if(key.equals(array[i]))
			{
				location = i;
				break;
			}
		}
		return location;
	}

	public static int binarySearch(String[] array, String key)
	{
		if( isSortedAsc( array ) == false )
		{	// array not sorted in ascending order, can't use binary search!
			// return -2 as error code or sort the array in ascending order
			//return -2;
			bubble(array);
		}
		int location = -1;	// not found
		int lower = 0;		// index of lowest element to check
		int upper = array.length - 1; // index of last element to check
		while( lower <= upper )
		{
			int mid = (lower + upper) / 2;
			if( array[mid].equals(key) )
			{	location = mid;
				break; // key found, exit while loop/stop searching
			} else if( key.compareTo(array[mid]) < 0 )
			{	upper = mid - 1;	// discard upper half, key is smaller than midpoint
			} else if( key.compareTo(array[mid]) > 0 ) // this could also be a plain else
			{	lower = mid + 1;	// discard lower half, key is larger than midpoint
			}
		}
		return location;
	}

	public static boolean isSortedAsc(String[] array)
	{
		for(int i = 0; i < array.length - 1; i++)
		{	if(array[i].compareTo(array[i+1]) > 0)
			{	return false;
			}
		}
		return true;
	}
	
	public static boolean isSortedDesc(String[] array)
	{
		for(int i = 0; i < array.length - 1; i++)
		{	if(array[i].compareTo(array[i+1]) < 0)
			{	return false;
			}
		}
		return true;
	}

	public static String sortedMode(String[] array)
	{
		String bSorted = "unsorted";
		if( isSortedAsc(array) )
		{	bSorted = "ascending";
		}
		if( isSortedDesc(array) )
		{	bSorted = "descending";
		}
		return bSorted;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Marking Scheme");
		
		// DO NOT MODIFY THE CODE BELOW THIS COMMENT!!! ////// POLICE LINE DO NOT CROSS //////////////////////////////////////////////////////////////////////
		String[] original = { "dulcie","ernest","vasilis","juanita","saraann","torin","mathian","stanly","georgetta","dalis","taddeo","haroun","clyde","wake","hilary","mallory","prinz","carolin","barton","garnette","hanson","reina","bernice","carmela","drusie","ermentrude","abbey","lene","casey","kahaleel","glennie","kim","afton","wenda","prince","maddalena","nickey","elijah","ashlin","dex","morrie","alvin","jammal","andrej","liza","benedikt","hillard","manon","robby","cari","jilly","carlyn","isa","reg","lincoln","basilio","avivah","jamie","chandal","bourke","heloise","midge","fernandina","gasper","sterling","jemmy","rosco","ardella","curcio","kitti","jamey","alejandrina","kimmie","hervey","hurley","joice","gisele","isac","armin","drusie","edyth","carlie","con","neddie","augustine","loraine","sloan","tilda","meggy","walther","averyl","marshall","meridel","tanny","merry","sibilla","carin","linnie","edy","clayson","zelig","imogene","amandie" };
		String[] b = clone(original);
		String[] s = clone(original);
		System.out.println( "The orginal array is " + sortedMode(original) );
		
		System.out.println("\nBubble sort on array b");
		bubble( b );
		System.out.println( "Array b is sorted in " + sortedMode(b) + " order." );
		
		
		System.out.println("\nSelection sort on array s");
		s = clone(original);
		selection( s );
		System.out.println( "Array s is sorted in " + sortedMode(s) + " order."  );

		System.out.print("\nSearching algorithms\n> Strings to search for: ");
		String[] searches = { "kaori", "benedikt", "dulcie", "amandie", "kitti" };
		int[] locationsL = { -1,45,0,102,69 };
		int[] locationsB = { -1,14,33,4,65 };
		printArray(searches);
		for(int i = 0; i < searches.length; i++)
		{
			int linear = linearSearch(original, searches[i]);
			System.out.printf("Linear search for %s (%d): %d\n", searches[i], locationsL[i], linear);
			int binary = binarySearch(b, searches[i]);
			System.out.printf("Binary search for %s (%d): %d\n", searches[i], locationsB[i], binary);
		}
		System.out.println( "\nbinarySearch(original, \"chandal\") [-2 or 24] = " + binarySearch(s, "chandal") );
	}
	
}
