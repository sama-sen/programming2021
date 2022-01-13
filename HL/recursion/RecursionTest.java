
public class RecursionTest
{
	public static void recursion1(int i)
	{	System.out.print(i + " ");
		if(i == 0)
			return;
		else
			recursion1(i-1);
	}
	
	public static void recursion2(int i)
	{	if(i == 0)
			return;
		else
			recursion2(i-1);
		System.out.print(i + " ");
	}
	
	public static void main (String[] args)
	{
		System.out.println("\n\nRecursion 1");
		recursion1(5);
		System.out.println("\n\nRecursion 2");
		recursion2(5);
	}
}

