package chapter6_classesAndObjects;

public class PhoneBillCalculatorOOP
{
    public static void main(String[] arg)
    {
        PhoneBill phoneBill = new PhoneBill();
        double overageFee = phoneBill.calculateOverageFee(phoneBill.getMinutesAllotted(), phoneBill.getMinutesUsed());
        double tax = phoneBill.calculateTax(phoneBill.getBaseCost(), overageFee);
        double total = phoneBill.calculateTotal(phoneBill.getBaseCost(), overageFee, tax);
        phoneBill.printPhoneBill(phoneBill.getBaseCost(), overageFee, tax, total);
    }
}
