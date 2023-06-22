package chapter14_final;

import java.util.Random;

public class Coin
{
    private String sideUp = "";
    final String HEADS = "heads";
    final String TAILS = "tails";

    public String getSideUp() {
        return sideUp;
    }

    public void setSideUp(String sideUp) {
        this.sideUp = sideUp;
    }

    public void flipCoin()
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(2);
        setSideUp(randomNumber == 0 ? HEADS : TAILS);

        System.out.println("Flipping...");
        System.out.println("It's " + getSideUp() + "!");
    }
}
