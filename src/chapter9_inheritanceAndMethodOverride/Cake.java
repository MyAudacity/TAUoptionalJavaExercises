package chapter9_inheritanceAndMethodOverride;

public class Cake
{
    private String flavour;
    private double price;

    public Cake()
    {
        bakeCake();
    }

    public Cake(String flavour, double price)
    {
        this.flavour = flavour;
        this.price = price;
        bakeCake(getFlavour(), getPrice());
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void bakeCake()
    {
        System.out.println("A cake is baked.");
    }
    public void bakeCake(String flavour, double price)
    {
        System.out.println("A " + flavour + " cake is baked. It costs $" + price);
    }
}
