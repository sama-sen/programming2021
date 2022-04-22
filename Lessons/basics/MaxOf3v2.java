public class MaxOf3v2
{
	
	public static void main (String[] args)
	{
		int x = IBIO.inputInt("X = ");
		int y = IBIO.inputInt("Y = ");
		int z = IBIO.inputInt("Z = ");
		int max = x; // let's assume x could be the maximum
		/* alternate less accurate version, i.e. does not work with negative only values
		 * int x = 0;	<-- this does not always work!!!
		 * if(x > max)
		 * {	max = x;
		 * }
		 */
		if(y > max)  // check if y is greater
		{	max = y;
		}
		if(z > max)  // check if z is greater
		{	max = z;
		}
		
		IBIO.output(max);
	}
}

