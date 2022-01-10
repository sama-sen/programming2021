/*
 * Pr5_4.java
 * 
 * More accurate calculation of Pi using sequence of fractions
 * Write a program that will add up the sequence up to
 * 100 terms. Output double the answer (3.1415926535897922)
 * output:								3.1415926535897922
 */


public class Pr5_4
{
	
	public static void main (String[] args)
	{
		double num = 1;
		double den = 1;
		double increment = 1;
		double term = 0;
		double sum = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			term = num / den;
			sum = sum + term;
			increment = increment + 2;
			num = num * i;
			den = den * increment;

		}
		System.out.println(sum * 2);
		
	}
}

