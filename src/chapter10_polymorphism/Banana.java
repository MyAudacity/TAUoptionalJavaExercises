package chapter10_polymorphism;

public class Banana extends Fruit
{
    @Override
    public void makeJuice()
    {
        System.out.println("Banana juice is made.");
    }
    public void peel()
    {
        System.out.println("A banana is now without a peel.");
    }
}
