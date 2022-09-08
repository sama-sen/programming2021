import java.util.Date;

public class Animal
{
    private String name;
    private int yearOfBirth;

    // empty constructor -> default values
    public Animal()
    {   this.name = "No name given";
        Date now = new Date();
        this.yearOfBirth = now.getYear() + 1900;
    }

    public Animal(String name, int yearOfBirth)
    {   this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName()
    {   return name;
    }

    public void setName(String name) {   this.name = name; }

    public int getYearOfBirth()
    {   return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth)
    {   this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString()
    {   return this.getClass() +
            " | Name: " + name +
            " | year of birth: " + yearOfBirth;
    }

    public void talk()
    {   System.out.println("Animals don't talk!");
    }

    public void eat()
    {   System.out.println("Animal eating...");
    }

}
