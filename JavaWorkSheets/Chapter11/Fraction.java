/*
 * Fraction.java
 *
 */


import java.util.Scanner;

public class Fraction
{
    // attibutes or instance variables/fields (data)
    private int num;    // private = you can't touch this!
    private int den;    // ...outside of the Fraction class.

    // empty constructor (no parameters/arguments)
    public Fraction()
    {
        this.num = 0;
        this.den = 1;
    } // empty constructor

    public Fraction(int num, int den) // custom constructor
    {
        this.num = num;
        this.den = den;
    }
    // these constructors are overloaded

    // encapsulation examples
    // accessor method ('getter')
    public int getNum()
    {
        return this.num;
    }

    // mutator/modifier method ('setter')
    public void setNum(int num)
    {
        this.num = num;
    }

    public int getDen()
    {
        return this.den;
    }

    public void setDen(int den)
    {
        this.den = den;
    }

    public static Fraction enter()
    {
        String strFraction = IBIO.input("Enter fraction (a/b format): ");
        strFraction = strFraction.replace("/", " "); // Changes slash to space
        Scanner parse = new Scanner(strFraction); // to parse fraction
        int num = parse.nextInt(); // so we can extract the numerator &
        int den = parse.nextInt(); // denominator; also this.num & this.den
		Fraction f = new Fraction(num, den);
        //this.simplify(); // <<< uncomment after you complete problem
        return f;
    }

    // polymorphism -- overloading Object's toString()
    public String toString()
    {
        return this.num + "/" + this.den;
    }


}

