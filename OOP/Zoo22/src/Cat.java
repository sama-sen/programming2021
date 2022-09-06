public class Cat extends Animal
{
    private String coat;

    public Cat(String name, int yearOfBirth, String coat)
    {
        super(name, yearOfBirth);
        this.coat = coat;
    }

    public String getCoat()
    {
        return coat;
    }

    public void setCoat(String coat)
    {
        this.coat = coat;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                " | coat: " + coat;
    }

    public void talk()
    {
        System.out.println("Meow meow");
    }

    public void eat()
    {
        System.out.println("Chew chew");
    }
}
