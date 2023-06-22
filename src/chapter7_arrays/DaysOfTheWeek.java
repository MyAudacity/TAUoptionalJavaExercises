package chapter7_arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysOfTheWeek
{
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number corresponding to a week day: ");
        int number = scanner.nextInt();

        Map<Integer, String> weekdaysByNumbers = weekdaysByNumbersCreator();
        dayPrinter(number, weekdaysByNumbers);

        scanner.close();
    }
    public static void dayPrinter(int number, Map<Integer, String> weekdaysByNumbers)
    {
        if (number > 7 || number < 1)
        {
            System.out.println("Bad Input");
            System.exit(0);
        }
        System.out.println(weekdaysByNumbers.get(number));
    }

    public static Map<Integer, String> weekdaysByNumbersCreator()
    {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Map<Integer, String> weekdaysByNumbers = new HashMap<>();

        for (int i = 1; i < weekdays.length + 1; i++)
        {
            weekdaysByNumbers.put(i, weekdays[i-1]);
        }
        return weekdaysByNumbers;
    }
}
