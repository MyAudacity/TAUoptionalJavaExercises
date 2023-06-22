package chapter10_polymorphism;

public class Pear extends Fruit
{
    @Override
    public void makeJuice()
    {
        System.out.println("Pear juice is made.");
    }
    public void removeSeeds()
    {
        System.out.println("A pear is now seedless.");
    }
}
