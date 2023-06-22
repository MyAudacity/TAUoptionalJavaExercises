package chapter14_final;

import java.util.Scanner;

public class CoinTossGame
{
    public static void main(String[] arg)
    {
        CoinTossGame game = new CoinTossGame();
        Scanner scanner = new Scanner(System.in);

        Player player1 = new Player(game.getPlayerName(scanner));
        Player player2 = new Player(game.getPlayerName(scanner));

        Coin coin = new Coin();

        game.getPlayerGuess(player1, player2, coin, scanner);

        coin.flipCoin();

        game.getWinner(player1, player2, coin);

        scanner.close();
    }

    private String getPlayerName(Scanner scanner)
    {
        System.out.print("Player, enter your name: ");
        return scanner.next();
    }

    private void getPlayerGuess(Player player1, Player player2, Coin coin, Scanner scanner)
    {
        do
        {
            System.out.print(player1.getName() + ", " + coin.HEADS + " or " + coin.TAILS + "? ");
            player1.setGuess(scanner.next().toLowerCase());
        }
        while (!player1.getGuess().equals(coin.HEADS) &&
                !player1.getGuess().equals(coin.TAILS));

        player2.setGuess(player1.getGuess().equals(coin.HEADS) ? coin.TAILS : coin.HEADS);
    }
    private void getWinner(Player player1, Player player2, Coin coin)
    {
        if (coin.getSideUp().equals(player1.getGuess()))
        {
            System.out.println(player1.getName() + " won because they guessed " + player1.getGuess() + ".");
        }
        else
        {
            System.out.println(player2.getName() + " won because " + player1.getName() + " guessed " + player1.getGuess() + ".");
        }
    }
}
