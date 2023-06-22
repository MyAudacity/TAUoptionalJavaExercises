package chapter6_classesAndObjects;

import java.text.DecimalFormat;

public class PhoneBill
{
    private int id;
    private double baseCost;
    private int minutesAllotted;
    private int minutesUsed;

    public PhoneBill()
    {
        id = 0;
        baseCost = 500;
        minutesAllotted = 600;
        minutesUsed = 601;
    }

    public PhoneBill(int id)
    {
        this.id = id;
        baseCost = 500;
        minutesAllotted = 600;
        minutesUsed = 500;
    }

    public PhoneBill(int id, double baseCost, int minutesAllotted, int minutesUsed)
    {
        this.id = id;
        this.baseCost = baseCost;
        this.minutesAllotted = minutesAllotted;
        this.minutesUsed = minutesUsed;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getBaseCost()
    {
        return baseCost;
    }

    public void setBaseCost(double baseCost)
    {
        this.baseCost = baseCost;
    }

    public int getMinutesAllotted()
    {
        return minutesAllotted;
    }

    public void setMinutesAllotted(int minutesAllotted)
    {
        this.minutesAllotted = minutesAllotted;
    }

    public int getMinutesUsed()
    {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed)
    {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverageFee(int minutesAllotted, int minutesUsed)
    {
        final double overageRate = 0.25;
        if (minutesAllotted > minutesUsed)
        {
            return 0;
        }
        return (minutesUsed - minutesAllotted) * overageRate;
    }

    public double calculateTax(double baseCost, double overageFee)
    {
        final double taxRate = 0.15;
        return (baseCost + overageFee) * taxRate;
    }

    public double calculateTotal(double baseCost, double overageFee, double tax)
    {
        return baseCost + overageFee + tax;
    }

    public void printPhoneBill(double baseCost, double overageFee, double tax, double total)
    {
        DecimalFormat numberFormat = new DecimalFormat("#0.00");

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + numberFormat.format(baseCost));
        System.out.println("Overage: $" + numberFormat.format(overageFee));
        System.out.println("Tax: $" + numberFormat.format(tax));
        System.out.println("Plan: $" + numberFormat.format(total));
    }
}
