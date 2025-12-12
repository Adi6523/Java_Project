package Studata;
import java.util.Scanner;
public class Marks {


	public static void main(String[] args) {

    	int i=0,s=0;
    	String name;
        int rollNo;
        String address;
        double maths;
        double science;
        double english;
        
        Scanner sc=new Scanner(System.in);
        
        
//        System.out.println("Enter the Name");
//        name=sc.next();
//        
//        System.out.println("Enter the Roll no.");
//        rollNo=sc.nextInt();
//        
//        System.out.println("Enter the Address");
//        address=sc.next();
//        
//        System.out.println("Enter the Mark For Maths");
//        maths=sc.nextDouble();
//        
//        System.out.println("Enter the Mark For Science");
//        science=sc.nextDouble();
//        
//        System.out.println("Enter the Mark For English");
//        english=sc.nextDouble();
        
       System.out.println("Enter the No. of Students");
       s=sc.nextInt();
       Student[] student = new Student[s];
       i=0;
       while(i<s)
        {
        	System.out.println("Enter the Name");
            name=sc.next();
            
            System.out.println("Enter the Roll no.");
            rollNo=sc.nextInt();
            
            System.out.println("Enter the Address");
            address=sc.next();
            
            System.out.println("Enter the Mark For Maths");
            maths=sc.nextDouble();
            
            System.out.println("Enter the Mark For Science");
            science=sc.nextDouble();
            
            System.out.println("Enter the Mark For English");
            english=sc.nextDouble();
            
            student[i] = new Student(name, rollNo,address,
            		maths, science, english);
            i++;
        }
        
        
//        Student s1 = new Student(name, rollNo,address,
//        		maths, science, english);

        System.out.println("---- Student ----");
        i=0;
        while(i<s)
        {	
        	System.out.println(student[i]);
        	i++;
        }

    }
}
