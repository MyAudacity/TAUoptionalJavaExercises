package chapter11_interfacesAndAbstractions;

public abstract class Animal
{
    public abstract void makeSound();

    public void eat()
    {
        System.out.println("Animal is eating.");
    }
}
