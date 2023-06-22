package chapter2_fundamentals;

import java.util.Scanner;

public class MadLibs
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = scanner.next();

        System.out.print("Enter a season of the year: ");
        String season = scanner.next();

        System.out.print("Enter a number: ");
        String number = scanner.next();

        System.out.println("On a " + adjective + " " +
                            season + " day, I drink a minimum of " +
                            number + " cups of coffee.");
        scanner.close();
    }
}
