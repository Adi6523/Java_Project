package hello_world;
import java.util.Scanner;
public class Add_number {

	public Add_number() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a, b;
		System.out.println("Enter 2 numbers to add");
		a=sc.nextInt();
		b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition of two numbers is  "+c);
	}

}
