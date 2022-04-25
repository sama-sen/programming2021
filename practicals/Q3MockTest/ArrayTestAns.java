/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class ArrayTestAns
{
	// Array size:
	public static int size(double[] array)
	{
		int result = array.length; // modify
		return result;
	}
	//------------------------------------------------------------------

	public static double min(double[] array)
	{
		double min = array[0];
		for(int i = 1; i < array.length; i++)
		{	if( array[i] < min)
			{	min = array[i];
			}
		}
		return min;
	}
	//------------------------------------------------------------------
	
	public static double max(double[] array)
	{
		double max = array[0];
		for(int i = 1; i < array.length; i++)
		{	if( array[i] > max)
			{	max = array[i];
			}
		}
		return max;
	}
	//------------------------------------------------------------------

	public static double range(double[] array)
	{
		double result = max(array)-min(array);
		return result;
	}
	//------------------------------------------------------------------

	public static double average(double[] array)
	{
		double result = 0;
		for(int i = 0; i < array.length; i++)
		{	result = result + array[i];
		}
		return result / array.length;
	}
	//------------------------------------------------------------------

	public static double median(double[] array)
	{
		double result = 0;
		Arrays.sort(array);
		int len = array.length;
		int mid = len/2;
		if(len % 2 == 0)
		{	result = (array[mid-1] + array[mid]) / 2;
		} else {
			result = array[mid];
		}
		return result;
	}
	//------------------------------------------------------------------

	public static double mode(double[] array)
	{
		double mode = 0;
		int maxFreq = 0;
		int modeIndex = -1;	// rogue value to indicate no mode found
		for(int i = 0; i < array.length; i++)
		{	int frequency = 0;
			for( int j = 0; j < array.length; j++)
			{	if( array[i] == array[j] )
				{	frequency++;
				}
			}
			if( frequency > maxFreq )
			{	maxFreq   = frequency;
				modeIndex = i;
			}
		}
		if( modeIndex != -1 )			// (single mode found)
		{	mode = array[modeIndex];
		} else {	// otherwise, -1 will be returned => mode not found
			mode = modeIndex;
		}
		return mode;
	}
	
	public static double formatDouble(double x, int decimals)
	{
		int factor = (int)Math.pow(10, decimals);
		int number = (int)(x * factor);
		double result = (double)number / factor;			
		return result;
	}
	//------------------------------------------------------------------
	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");
		System.out.println("Marcos Drien");
		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements    : " + size(rainfall) );
		System.out.println( "Minimum   (0.20): " +
			formatDouble(min(rainfall), 2) );
		System.out.println( "Maximum (765.90): " +
			formatDouble(max(rainfall), 2) );
		System.out.println( "Range   (765.70): " +
			formatDouble(range(rainfall), 2) );
		System.out.println( "Average (178.89): " +
			formatDouble(average(rainfall), 2) );
		System.out.println( "Mode    (127.20): " +
			formatDouble(mode(rainfall), 2) );
		System.out.println( "Median  (159.70): " +
			formatDouble(median(rainfall), 2) );

		System.out.println( "\nSingapore Temperature Statistics" );
		System.out.println( "Measurements   : " + size(temperature) );
		System.out.printf( "Minimum (25.40): %.2f\n", min(temperature) );
		System.out.printf( "Maximum (29.50): %.2f\n", max(temperature) );
		System.out.printf( "Range    (4.10): %.2f\n", range(temperature) );
		System.out.printf( "Average (27.63): %.2f\n", average(temperature) );
		System.out.printf( "Mode    (27.30): %.2f\n", mode(temperature) );
		System.out.printf( "Median  (27.70): %.2f\n", median(temperature) );

		System.out.println();
		// Information about printf:
		// https://kodejava.org/how-do-i-align-string-print-out-in-left-right-center-alignment/
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}


