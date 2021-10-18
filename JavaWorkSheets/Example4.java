
public class Example4
{
	
	public static void main (String[] args)
	{
		for(int i = 0; i < 20; i = i + 1)
		{
			IBIO.output( "i = " + i + " hello");
		}
		IBIO.output("======================");
		for(int i = 1; i <= 20; i = i + 1)
		{
			IBIO.output( "i = " + i + " hello");
		}
		IBIO.output("======================");
		for(int i = 10; i > 0; i = i - 1)
		{
			IBIO.out( i + " " );
		}
		IBIO.output(""); // goes down one line
		for(int i = 1; i < 20; i = i + 2)
		{
			IBIO.out( i + " " );
		}
		
		IBIO.output("\n*** BOOM ***");
		IBIO.output("OUCH");
	}
}


/*

i = 0 hello
i = 1 hello
i = 2 hello
i = 3 hello
i = 4 hello
i = 5 hello
i = 6 hello
i = 7 hello
i = 8 hello
i = 9 hello
i = 10 hello
i = 11 hello
i = 12 hello
i = 13 hello
i = 14 hello
i = 15 hello
i = 16 hello
i = 17 hello
i = 18 hello
i = 19 hello
======================
i = 1 hello
i = 2 hello
i = 3 hello
i = 4 hello
i = 5 hello
i = 6 hello
i = 7 hello
i = 8 hello
i = 9 hello
i = 10 hello
i = 11 hello
i = 12 hello
i = 13 hello
i = 14 hello
i = 15 hello
i = 16 hello
i = 17 hello
i = 18 hello
i = 19 hello
i = 20 hello
======================
10 9 8 7 6 5 4 3 2 1 *** BOOM ***
OUCH

*/
