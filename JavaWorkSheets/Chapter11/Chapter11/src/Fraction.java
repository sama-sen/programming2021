/*
 * Fraction.java
 *
 */


import java.util.Scanner;

public class Fraction
{
    // attributes or instance variables/fields (data)
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
        this.simplify();
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

    public static Fraction enter() // this'd be better off in the test class, though...
    {
        String strFraction = IBIO.input("Enter fraction (a/b format): ");
        strFraction = strFraction.replace("/", " "); // Changes slash to space
        Scanner parse = new Scanner(strFraction); // to parse fraction
        int num = parse.nextInt(); // so we can extract the numerator &
        int den = parse.nextInt(); // denominator; also this.num & this.den
        Fraction f = new Fraction(num, den);
        f.simplify(); // <<< uncomment after you complete problem
        return f;
    }

    public void add(Fraction f)
    {
        int n = this.num * f.den;
        int d = this.den * f.num;
        int tn = n + d;
        int td = this.den * f.den;
        this.num = tn;
        this.den = td;
        this.simplify();
    }

    public void add(Fraction f, Fraction g)
    {
        int n = f.num * g.den;
        int d = f.den * g.num;
        int tn = n + d;
        int td = f.den * g.den;
        this.setNum(tn);
        this.setDen(td);
        this.simplify();
    }

    /*
    public Fraction add(Fraction f, Fraction g)
    {
        int n = f.num * g.den;
        int d = f.den * g.num;
        int tn = n + d;
        int td = f.den * g.den;
        Fraction result = new Fraction(tn, td);
        result.simplify();
        return result;
    }

    public Fraction add(Fraction f)
    {
        int n = this.num * f.den;
        int d = this.den * f.num;
        int tn = n + d;
        int td = this.den * f.den;
        Fraction result = new Fraction(tn, td);
        result.simplify();
        return result;
    }
    */

    // calculate the GCD to simplify a fraction
    private static int gcd(int n, int m)
    {
        if (n == m)
        {
            return n;
        } else
        {
            while (n != m)
            {
                if (n < m)
                    m = m - n;
                else
                    n = n - m;
            }
        }
        return n;
    }

    public void simplify() // simplify
    {
        int gcd = gcd(this.num, this.den);
        this.num = this.num / gcd;
        this.den = this.den / gcd;
    }

    public double toDecimal()
    {
        return (double) this.num / this.den;
    }

    public boolean equals(Fraction f)
    {
        return this.toDecimal() == f.toDecimal();
    }

    public double compareTo(Fraction f)
    {
        return this.toDecimal() - f.toDecimal();
    }

    // polymorphism -- overloading Object's toString()
    public String toString()
    {
        return this.num + "/" + this.den;
    }


}

