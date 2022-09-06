public class CatTest
{
    public static void main(String[] args)
    {
        Cat whiskers = new Cat("Whiskers",
                2020, "long");
        System.out.println(whiskers);
        whiskers.setCoat("short");
        System.out.println( whiskers.getCoat() );
        whiskers.talk();
        whiskers.eat();
    }
}
