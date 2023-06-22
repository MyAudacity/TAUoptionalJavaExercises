package chapter3_conditionals;

import java.util.Scanner;

public class ChangeForDollarGame
{
    public static void main(String[] arg)
    {
        final int penny = 1;
        final int nickel = 5;
        final int dime = 10;
        final int quarter = 25;
        final int dollar = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pennies? ");
        var pennyAmount = scanner.nextInt();

        System.out.print("How many nickels? ");
        var nickelAmount = scanner.nextInt();

        System.out.print("How many dimes? ");
        var dimeAmount = scanner.nextInt();

        System.out.print("How many quarters? ");
        var quarterAmount = scanner.nextInt();

        var sum = penny * pennyAmount +
                  nickel * nickelAmount +
                  dime * dimeAmount +
                  quarter * quarterAmount;

        if (sum == dollar)
        {
            System.out.println("Congratulations, you won.");
        }
        else if (sum < dollar)
        {
            System.out.println("Unfortunately, you were " + (dollar - sum) + "cents short.");
        }
        else
        {
            System.out.println("Unfortunately, you had " + (sum - dollar) + " cents too many.");
        }
        scanner.close();
    }
}
