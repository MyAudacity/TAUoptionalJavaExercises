package chapter10_polymorphism;

public class Market
{
    public static void main(String[] arg)
    {
        Fruit fruit = new Fruit();
        fruit.setCalories(1);
        fruit.makeJuice();
        System.out.println();

        Fruit anotherFruit = new Pear();
        anotherFruit.setCalories(7);
        anotherFruit.getCalories();
        anotherFruit.makeJuice();
        System.out.println();

        Fruit lastFruit = new Banana();
        lastFruit.makeJuice();
        ((Banana) lastFruit).peel();
    }
}
