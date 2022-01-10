/**
 * S1 Exam, question #11
 * Counting the number of times an input number can be halved
 */
public class Exam11
{

    public static int half(double x)	// or double x = IBIO.inputDouble("Enter a number >= 1: " );
    {
        int c = 0;
        if( x < 1 )
        {    return -1;
		}
		while( x > 1 )	// you may also use do-while
		{	x = x / 2;
			c++;
		}
		c--;	// here we adjust the counter so that it shows the number of times we half the input number before it goes < 1
		return c;
    }

    public static int half2(double x)	// or double x = IBIO.inputDouble("Enter a number >= 1: " );
    {
        int c = 0;
        if( x < 1 )
        {    return -1;
		}
        while( x >= 1 )	// you may also use do-while
		{	x = x / 2;
			if(x>=1)	// here we make sure to count the number of times we half the input number before it goes < 1
			{	c++;
			}
		}
		return c;
    }
    
    public static void main(String[] args)
    {
		System.out.println( half(27.9)  );
		System.out.println( half2(27.9) );
		System.out.println( "-------------------------------------------------------------" );
		// if we were to code this problem in the main method, it'd look like this:
		int c = 0;
		double x = IBIO.inputDouble("Enter a number >= 1: " );
        if( x < 1 )
        {    IBIO.output( -1 );
		} else
		{
			while( x >= 1 )	// you may also use do-while
			{	x = x / 2;
				if( x >= 1 )// here we make sure to count the number of times we half the input number before it goes < 1
				{	c++;
				}
			}
			IBIO.output( c );
		}
		
	}

}


/*
enter a number: 27.9
Before/without adjustments: 0.871875    5
After adjustments: 1.74375    4
*/
