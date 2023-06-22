package chapter9_inheritanceAndMethodOverride;

public class BirthdayCake extends Cake
{
    private int candles;

    public BirthdayCake() {}

    public BirthdayCake(String flavour, double price, int candles)
    {
        super(flavour, price);
        bakeCake(candles);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
    @Override
    public void bakeCake()
    {
        System.out.println("A birthday cake is baked.");
    }
    public void bakeCake(int candles)
    {
        System.out.println("It's a birthday cake. It has " + candles + " candle(s).");
    }
}
