package org.example;

import java.sql.*;

public class EmployeeDemo {

    public static void main(String[] args) throws SQLException {


        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\homework_4\\hr.db";
        String query = "select * from employees";


        try (Connection conn = DriverManager.getConnection(url)){
            Statement st = conn.createStatement();
            ResultSet rs =st.executeQuery(query);


            while (rs.next()){
                Employees e = new Employees(rs);
                System.out.println(e);
            }
        }
    }
}
