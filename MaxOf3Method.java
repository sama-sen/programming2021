public class MaxOf3Method
{
	public static int max(int x, int y, int z)
	{
		int max = 0;
		if(x > y)
		{	max = x;
		} else
		{	max = y;
		}
		if(z > max)
		{	max = z;
		}
		return max;
	}
	
	
	public static void main (String[] args)
	{
		
		IBIO.output( max(3,9,4) );
	}
}

