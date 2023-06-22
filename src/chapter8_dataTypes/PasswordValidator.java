package chapter8_dataTypes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator
{
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.next();

        System.out.print("Enter your password: ");
        String passwordOld = scanner.next();

        passwordValidator(username, passwordOld, scanner);

        scanner.close();
    }
    public static void passwordValidator(String username, String passwordOld, Scanner scanner)
    {
        boolean passwordIsValid = false;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");

        while (!passwordIsValid)
        {
            System.out.print("Enter new password: ");
            String passwordNew = scanner.next();
            Matcher matcher = pattern.matcher(passwordNew);

            if (passwordNew.length() < 8)
            {
                System.out.println("Password must be at least 8 characters long.");
                continue;
            }
            if (passwordNew.equals(username) || passwordNew.equals(passwordOld))
            {
                System.out.println("Password cannot be the same as username or old password.");
                continue;
            }
            if (passwordNew.toLowerCase().equals(passwordNew))
            {
                System.out.println("Password must contain at least one capital letter");
                continue;
            }
            if (matcher.matches())
            {
                System.out.println("Password must contain at least one special character");
                continue;
            }
            else
            {
                passwordOld = passwordNew;
                passwordIsValid = true;
                System.out.println("Your new password is: " + passwordNew);
            }
        }


    }
}
