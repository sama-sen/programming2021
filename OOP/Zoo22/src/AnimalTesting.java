public class AnimalTesting
{
    public static void main(String[] args)
    {
        Animal baby = new Animal();
        System.out.println(baby);
        baby.setName("Baba");
        System.out.println(baby);
        baby.eat();
        Animal fido = new Animal("Joe", 2020);
        System.out.println(fido); // toString testing
        fido.setYearOfBirth(2019);
        System.out.println(fido);
        System.out.println(fido.getName() + "\t" +
                fido.getYearOfBirth());
        fido.talk();

        Dog pluto = new Dog("Pluto", 2012, 20);
        pluto.setAgeInDogYears(40);
        System.out.println(pluto);
        System.out.println(pluto.getName() + "'s age: " + pluto.getAgeInDogYears());

        Dog killer = new Dog("Cujo", 2018);
        System.out.println(killer);
        killer.talk();
    }
}
