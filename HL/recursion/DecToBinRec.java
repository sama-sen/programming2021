import java.util.*;

public class DecToBinRec
{
	
    public static void decToBin(int n)
    {
        if (n == 0) // base case
        {
			System.out.print( 0 );  // make it work for input = 0
            return; // exit/stop recursion when done
        }
        decToBin( n / 2 );
        System.out.print( n % 2 );

    }
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (base 10): ");
        int b10 = input.nextInt();
        
        if(b10 < 0)
        {	System.out.print("Negatives not allowed. Making the input positive.");
			b10 = b10 * -1;
		}
/*		
		while( b10 < 0 )
        {	System.out.print("Negatives not allowed. Re-enter: ");
			b10 = input.nextInt();
		}
*/	
        System.out.println();
        System.out.print(b10 + " base 10 = ");
        decToBin(b10);
        System.out.println(" base 2.\n");
    }
}
