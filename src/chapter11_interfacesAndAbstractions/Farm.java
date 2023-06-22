package chapter11_interfacesAndAbstractions;

public class Farm
{
    public static void main(String[] arg)
    {
        Animal animal = new Pig();
        animal.makeSound();
        System.out.println();

        Animal newAnimal = new Duck();
        newAnimal.eat();
        newAnimal.makeSound();
    }
}
