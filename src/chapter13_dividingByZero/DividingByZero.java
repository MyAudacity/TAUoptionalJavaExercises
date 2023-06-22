package chapter13_dividingByZero;

public class DividingByZero
{
    public static void main(String[] arg)
    {
        int c;
        try {
            c = 30/0;
            System.out.println("Result: " + c);
        }
        catch (Exception e)
        {
            System.out.println("Please don't divide by 0.");
        }
        finally {
            System.out.println("Division is fun.");
        }
    }
}
