package hello_world;
import java.util.Scanner;

public class Add_number {

    // Constructor
    public Add_number() {
        // Declare variables
        Scanner sc = new Scanner(System.in);
        int a, b;

        // Taking input
        System.out.println("Enter 2 numbers to add:");
        a = sc.nextInt();
        b = sc.nextInt();

        // Performing addition
        int c = a + b;

        // Displaying result
        System.out.println("Addition of two numbers is: " + c);
    }

    public static void main(String[] args) {
        // Creating an object of Add_number class to invoke the constructor
        Add_number a = new Add_number();
    }
}
