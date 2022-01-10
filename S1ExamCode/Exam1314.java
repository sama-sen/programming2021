/*
 * Code snippets/fragments questions
 * Question number 13 in the HL paper, 14 in the SL exam
 * 
 * Some modifications had to be made to fit all questions
 * in the same Java program/class (mostly omitting int declarations)
 * 
 */
public class Exam1314
{
	public static void main(String[] args)
	{

		// QUESTION 13 HL / 14 SL
		int a, b, c;
		System.out.println("Question 13HL / 14SL:");

		a = 7;	b = 3;
		System.out.println("(a) " + a * b);
		System.out.println("(b) " + a / b);
		System.out.println("(c) " + a % b);
		System.out.print("(d) ");
		if(a > 2 * b)
			a++;
		System.out.println(a * b);

		System.out.print("(e) ");
		a = 7;		b = 3;
		if(a < 5)
			a++;
		else
			b++;
		System.out.println(a * b);

		System.out.print("(f) ");
		a = 7;		b = 3;
		switch(a)
		{	case 7:		System.out.print(a + "  ");	//break;
			case 3:		System.out.print(b + "  ");	//break;
			default:	System.out.print(a * b);	//break;
		};	System.out.println("");

		System.out.println("(g)");
		a = 7;		b = 3;
		for(int i = 0; i < 3; i++)
		{	System.out.print( "a="+a+"\tb="+b );
			a = a + b;
			System.out.println("\tOUTPUT (a)="+a);
		}	System.out.println("");

		System.out.println("(h)");
		a = 7;		b = 3;
		while(b < 20)
		{	System.out.print( "a="+a+"\tb="+b+"\tb<20? "+(b<20) );
			a = a + b;
			b = 2 * b;
			System.out.println("\tOUTPUT (a*b)=" + a * b);
		}	System.out.println("");

		System.out.println("(i)");
		a = 7;		b = 3;
		do
		{	System.out.print("a="+a+"\tb="+b+"\ta%b="+(a%b)+"\ta<=20? "+(a<=20) );
			a = a + a % b;
			b++;
			System.out.println("\tOUTPUT (a)=" + a );
		} while(a <= 20);
		System.out.println("");

		System.out.println("(j)");
		a = 7;		b = 3;	c = 1;
		while(b > 0)
		{	System.out.print("a="+a+"\tb="+b+"\tc="+c);
			c = c * a;
			b--;
			System.out.println("\tOUTPUT (c)=" + c);
		}	System.out.println("");

		System.out.println("(k)");
		a = 7;		b = 3;
		System.out.println("a="+a+"\tb="+b);
		for(int i = 0; i < 3; i++)
		{	a = a + b;
			b = a - b;
			System.out.print("\ta="+a+"\tb="+b);
			System.out.println("\tOUTPUT (a*b)="+(a * b));
		}	System.out.println("");

		System.out.println("(l)");
		a = 7;		b = 3;
		for(int i = 0; i < 3; i++)
		{	System.out.print("a="+a+"\tb="+b);
			a = - a;
			b = b * 2;
			System.out.println("\tOUTPUT (a*b)="+(a * b));
		}	System.out.println("");


	}
}

/*

Question 13HL / 14SL:
(a) 21
(b) 2
(c) 1
(d) 24
(e) 28
(f) 7  3  21
(g)
a=7     b=3     OUTPUT (a)=10
a=10    b=3     OUTPUT (a)=13
a=13    b=3     OUTPUT (a)=16

(h)
a=7     b=3     b<20? true      OUTPUT (a*b)=60
a=10    b=6     b<20? true      OUTPUT (a*b)=192
a=16    b=12    b<20? true      OUTPUT (a*b)=672

(i)
a=7     b=3     a%b=1   a<=20? true     OUTPUT (a)=8
a=8     b=4     a%b=0   a<=20? true     OUTPUT (a)=8
a=8     b=5     a%b=3   a<=20? true     OUTPUT (a)=11
a=11    b=6     a%b=5   a<=20? true     OUTPUT (a)=16
a=16    b=7     a%b=2   a<=20? true     OUTPUT (a)=18
a=18    b=8     a%b=2   a<=20? true     OUTPUT (a)=20
a=20    b=9     a%b=2   a<=20? true     OUTPUT (a)=22

(j)
a=7     b=3     c=1     OUTPUT (c)=7
a=7     b=2     c=7     OUTPUT (c)=49
a=7     b=1     c=49    OUTPUT (c)=343

(k)
a=7     b=3
        a=10    b=7     OUTPUT (a*b)=70
        a=17    b=10    OUTPUT (a*b)=170
        a=27    b=17    OUTPUT (a*b)=459

(l)
a=7     b=3     OUTPUT (a*b)=-42
a=-7    b=6     OUTPUT (a*b)=84
a=7     b=12    OUTPUT (a*b)=-168

*/
