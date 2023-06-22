package chapter9_inheritanceAndMethodOverride;

public class TasteTester
{
    public static void main(String[] arg)
    {
        Cake cake = new Cake();
        System.out.println();

        Cake anotherCake = new Cake("marzipan", 39.99);
        System.out.println();

        Cake oneMoreCake = new WeddingCake(); //Some polymorphism, very cool
        System.out.println();

        Cake cakeityCake = new WeddingCake("plum", 99.99, 5);
        System.out.println();

        ((WeddingCake) cakeityCake).setTiers(7);
        int newTiers =  ((WeddingCake) cakeityCake).getTiers();
        ((WeddingCake) cakeityCake).bakeCake(newTiers);
        System.out.println();

        WeddingCake weddingCake = new WeddingCake("lemon", 99.99, 5);
        System.out.println();

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavour("strawberry");
        birthdayCake.setPrice(59.99);
        birthdayCake.setCandles(4);
        System.out.println();

        BirthdayCake lastCake = new BirthdayCake("cherry", 99.99, 5);
    }
}
