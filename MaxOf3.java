public class MaxOf3
{
	
	public static void main (String[] args)
	{
		int x = IBIO.inputInt("X = ");
		int y = IBIO.inputInt("Y = ");
		int z = IBIO.inputInt("Z = ");
		int max = 0;
		if(x > y)
		{	max = x;
		} else
		{	max = y;
		}
		if(z > max)
		{	max = z;
		}
		
		IBIO.output(max);
	}
}

