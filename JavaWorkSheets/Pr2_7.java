/*
 * Pr2_7.java
	As above write a program to print out the numbers from 1 to 100 but OMIT printing all the even
	numbers and all the numbers divisible by 3
	
	input: numbers from 1~100
	processing: skip even and divisible by 3
	output: all numbers from 1~100 which are not even and divisible by 3
 */


public class Pr2_7
{

	public static void main (String[] args)
	{
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 != 0 && i % 3 != 0)
			//if( !(i % 2 == 0 || i % 3 == 0) )
			{	IBIO.out(i + " ");
			}
		}
	}
}

/*
 * 1 5 7 11 13 17 19 23 25 29 31 35 37 41 43 47 49 53 55 59 61 65 67 71 73 77 79 83 85 89 91 95 97
 * 1 5 7 11 13 17 19 23 25 29 31 35 37 41 43 47 49 53 55 59 61 65 67 71 73 77 79 83 85 89 91 95 97
 */
