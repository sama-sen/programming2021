public class FlowCharts
{
	
	public static void main (String[] args)
	{// declaration|initialisation
		int s		= 0;
		double x;
		x = IBIO.inputDouble("X = ");
		do
		{
			x = x / 10;
			s = s + 1;
		} while(x >= 1);
		IBIO.output(s);
	}
}

