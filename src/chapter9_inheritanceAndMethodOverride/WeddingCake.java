package chapter9_inheritanceAndMethodOverride;

public class WeddingCake extends Cake
{
    private int tiers;

    public WeddingCake() {}

    public WeddingCake(String flavour, double price, int tiers)
    {
        super(flavour, price);
        bakeCake(tiers);
    }
    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    @Override
    public void bakeCake()
    {
        System.out.println("A wedding cake is baked.");
    }
    public void bakeCake(int tiers)
    {
        System.out.println("It's a wedding cake. It has " + tiers + " tier(s).");
    }
}

