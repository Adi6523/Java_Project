package com.sunbeam.p1;
import java.sql.*;
import java.sql.DriverManager;
import java.util.*;

public class Program1 {
	private static final String URL="jdbc:mysql://localhost:3306/internship_db";
	private static final String USERNAME="root";
	private static final String PASSWORD="manager";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	
	public static void getAllStudents()
	{
		String sql = "SELECT * FROM students";
		try {
			Connection con= getConnection();
			PreparedStatement selectStatement = con.prepareStatement(sql);
			ResultSet rs = selectStatement.executeQuery();
			while(rs.next())
			{
				int rollno = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String course = rs.getString(5);
				System.out.println("\n\nRollno.: "+rollno+"\nName: "+name+"\nEmail: "+email+"\nCourse: "+course+"\n");
			}
			con.close();
			selectStatement.close();
		} catch (Exception e) {e.printStackTrace();}
	}
	
	public static void addStudents(Scanner sc)
	{
		System.out.println("Enter the name of the Student");
		String name = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter course");
		String course = sc.next();
		
//		String name = "Suresh";
//		String email = "suresh@gmail.com";
//		String course = "Java";
		String sql = "INSERT INTO students(name,email,course) VALUES(?,?,?)";
		try {
			Connection con = getConnection();
			PreparedStatement insertStatement = con.prepareStatement(sql);
			insertStatement.setString(1, name);
			insertStatement.setString(2, email);
			insertStatement.setString(3, course);
			insertStatement.executeUpdate();
			con.close();
			insertStatement.close();
			System.out.println("Student is inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateStudent(Scanner sc)
	{
		System.out.println("Enter the Rollno of the Student to update");
		int rno = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter course");
		String course = sc.next();
		String sql = "UPDATE students SET name=?,email=? , course = ? WHERE rollno=?";
		try {
			Connection con = getConnection();
			PreparedStatement updateStatement = con.prepareStatement(sql);
			updateStatement.setString(1, name);
			updateStatement.setString(2, email);
			updateStatement.setString(3, course);
			updateStatement.setInt(4, rno);
			updateStatement.executeUpdate();
			con.close();
			updateStatement.close();
			System.out.println("Student is Updated...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteStudents(Scanner sc)
	{
	    String sql = "DELETE FROM students WHERE rollno=?";
	    System.out.println("Enter the Rollno of the Student to delete");
	    int rno = sc.nextInt();

	    try (Connection con = getConnection();
	         PreparedStatement deleteStatement = con.prepareStatement(sql)) {

	        deleteStatement.setInt(1, rno);
	        int count = deleteStatement.executeUpdate();

	        if(count > 0)
	            System.out.println("Student deleted successfully...");
	        else
	            System.out.println("Student not found...");
	    }
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String [] args)
	{
		enum mainmenu {
			EXIT,DisplayAll,AddStudents,UpdateStudents,DeleteStudents
		}
		Scanner sc=new Scanner(System.in);
		mainmenu[] arr=mainmenu.values();
		mainmenu echoice;
		do {
			for (mainmenu ele : arr) {
				System.out.println(ele.ordinal()+" . "+ele.name());
			}
			System.out.println("Enter the Choice");
			int choice = sc.nextInt();
			echoice = arr[choice];
			
			switch (echoice) {
			case EXIT: {
				System.exit(0);
			}
			break;
			case DisplayAll: {
				getAllStudents();
			}
			break;
			case AddStudents: {
				addStudents(sc);
			}
			break;
			case UpdateStudents: {
				updateStudent(sc);
			}
			break;
			case DeleteStudents: {
				deleteStudents(sc);
			}
			break;
			default:
				System.out.println("Wrong Choice ...");
			}
			
		} while (echoice!=mainmenu.EXIT);
		
		//getAllStudents();
		//addStudents(sc);
		//updateStudent(sc);
		//deleteStudents(sc);
	}
}