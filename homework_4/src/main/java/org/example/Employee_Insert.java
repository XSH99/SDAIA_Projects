package org.example;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee_Insert {

    public static void main(String[] args) throws SQLException{
    Scanner sc = new Scanner(System.in);
    String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\homework_4\\hr.db";
    String query = "insert into employees values (?,?,?,?,?,?,?,?,?,?)";


     try (Connection coon = DriverManager.getConnection(url);) {

         PreparedStatement st = coon.prepareStatement(query);

         System.out.println("Enter Employee Id:");
         int employee_id = sc.nextInt();
         st.setInt(1, employee_id);
         sc.nextLine();

         System.out.println("enter First Name: ");
         String first_name = sc.nextLine();
         st.setString(2, first_name);


         System.out.println("Enter Last Name: ");
         String last_name = sc.nextLine();
         st.setString(3, last_name);


         System.out.println("Enter Email: ");
         String email = sc.nextLine();
         st.setString(4, email);

         System.out.println("Enter Phone Number: ");
         String phone_number = sc.nextLine();
         st.setString(5, phone_number);

         System.out.println("Enter Hire Date: ");
         String hire_date = sc.nextLine();
         st.setString(6, hire_date);

         System.out.println("Enter Job Id:");
         int job_id = sc.nextInt();
         st.setInt(7, job_id);

         System.out.println("Enter Salary: ");
         double salary = sc.nextDouble();
         st.setDouble(8, salary);

         System.out.println("Enter Manager Id:");
         int manager_id = sc.nextInt();
         st.setInt(9, manager_id);

         System.out.println("Enter Department Id:");
         int department_id = sc.nextInt();
         st.setInt(10, department_id);


         int rows = st.executeUpdate();
         System.out.println(rows + "inserted update");


     }
    }
}
