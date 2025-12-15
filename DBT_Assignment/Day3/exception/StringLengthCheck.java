package exception;

import java.util.Scanner;

public class StringLengthCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            int length = str.length();
            if (length > 80) {
                throw new ExceptionLineTooLong();
            }
            else
            {
            	System.out.println("Length of string: " + length);
            }
        }
        catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}