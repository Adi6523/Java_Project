package Studata;

public class Student {
    private String name;
    private int rollNo;
    private String address;
    private double maths;
    private double science;
    private double english;

    public Student(String name, int rollNo, String address,
                   double maths, double science, double english) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
        this.maths = maths;
        this.science = science;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getAddress() {
        return address;
    }

    public double getMaths() {
        return maths;
    }

    public double getScience() {
        return science;
    }

    public double getEnglish() {
        return english;
    }

    public double getTotalMarks() {
        return maths + science + english;
    }

    @Override
    public String toString() {
        return  "\nName: " + name +
                "\nRoll No: " + rollNo +
                "\nAddress: " + address +
                "\nMaths: " + maths +
                "\nScience: " + science +
                "\nEnglish: " + english +
                "\nTotal Marks: " + getTotalMarks();
    }
}
