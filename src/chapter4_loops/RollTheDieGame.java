package chapter4_loops;

import java.util.Random;

public class RollTheDieGame
{
    public static void main(String[] arg)
    {
        final int boardSpaces = 20;
        final int dieRolls = 5;

        Random rand = new Random();
        int currentPos = 0;

        for (var i = 0; i < dieRolls; i++)
        {
            int roll = rand.nextInt(6) + 1;
            currentPos = currentPos + roll;

            if (currentPos == boardSpaces)
            {
                System.out.println("Roll #" + (i + 1) + ": You have rolled a " +
                                    roll + ". You are now on space " + currentPos +
                                    ". Congratulations, you won!");
                break;
            }
            else if (currentPos > boardSpaces)
            {
                System.out.println("Roll #" + (i + 1) + ": You have rolled a " +
                                    roll + ". You are now on space " + currentPos +
                                    ". What a shame, you lost!");
                break;
            }
            else if (currentPos < boardSpaces && (i + 1) == dieRolls)
            {
                System.out.println("Roll #" + (i + 1) + ": You have rolled a " +
                                    roll + ". You are now on space " + currentPos +
                                    ". What a shame, you ran out of rolls.");
                break;
            }
            else
            {
                System.out.println("Roll #" + (i + 1) + ": You have rolled a " +
                                    roll + ". You are now on space " + currentPos +
                                    " and have " + (boardSpaces - currentPos) + " to go.");
            }
        }
    }
}
