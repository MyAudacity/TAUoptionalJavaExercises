package chapter5_methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PhoneBillCalculator
{
    public static void main(String[] arg)
    {
        PhoneBillCalculator calc = new PhoneBillCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base cost of the plan: ");
        var baseCost = scanner.nextDouble();

        System.out.print("Enter the overage minutes: ");
        var overageMinutes = scanner.nextDouble();

        var overageFee = calc.calculateOverageFees(overageMinutes);
        var tax = calc.calculateTax(baseCost, overageFee);
        var total = calc.calculateTotal(baseCost, overageFee, tax);

        calc.printBill(baseCost, overageFee, tax, total);
        scanner.close();
    }
    public double calculateOverageFees(double minutes)
    {
        final double minuteCharge = 0.25;
        return minutes * minuteCharge;
    }
    public double calculateTax(double baseCost, double overageFees)
    {
        final double taxRate = 0.15;
        return (baseCost + overageFees) * taxRate;
    }
    public double calculateTotal(double baseCost, double overageFee, double tax)
    {
        return baseCost + overageFee + tax;
    }
    public void printBill(double baseCost, double overageFee, double tax, double total)
    {
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + numberFormat.format(baseCost));
        System.out.println("Overage: $" + numberFormat.format(overageFee));
        System.out.println("Tax: $" + numberFormat.format(tax));
        System.out.println("Plan: $" + numberFormat.format(total));
    }
}
