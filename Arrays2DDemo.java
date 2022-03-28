/*
 * Arrays2DDemo.java
 * 
 * 
 */


public class Arrays2DDemo
{
	public static void print2dArray(int[][] a)
	{
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.printf("%3d  ", a[row][col]);
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args)
	{
		int[][] a2d = 
					{	{1,3,5,7},
						{2,4,6,8},
						{11,13,15,17},
						{19,21,23,25}
					};
					
		print2dArray(a2d);
	}
}

