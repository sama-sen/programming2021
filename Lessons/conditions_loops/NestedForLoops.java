import java.util.Scanner;

public class NestedForLoops
{

	public static void main (String[] args)
	{
		int n = 5;
		Scanner in = new Scanner(System.in);
		do
		{	int printk = 0;
			int comparisons = 0;
			System.out.print(" N = ? : ");
			n = in.nextInt();
			if(n == 0)
			{	break; // exit do while loop
			}
			System.out.println(">>> For N = " + n);
			for(int k = 1; k <= n; k++)
			{	for(int j = 1; j <= n; j++)
				{
					//System.out.println(k + " " + j);
					comparisons++;
					if(k == j)
					{	
						System.out.println( " K = J :  " + k );
						printk++;
					}
				}
			}
			System.out.println("K is printed: " + printk);
			System.out.println("Comparisons : " + comparisons);
		} while( n != 0 );
	}
}

