package Studata;

public class Student {

    int rollNo;
    String name;
    double marks;
    
    public Student() {}

	// Parameterized constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
