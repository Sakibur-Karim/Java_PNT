package com.sqljdbc;

import java.sql.*;

public class RetrieveData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Step 1 you have to have JDBC dependency in your pom.xml
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "12345678";
        String query = "select * from MyDB.Student where Major = 'IT';";

        // Step 2 download the driver using the class.forName()
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 3 creating conection object and using get connection method this method is driver manager class, here we are passing the url, username and password
        Connection con = DriverManager.getConnection(url, username, password);

        // Step 4 i will create statement object this will allow to execute my dml commands select insert update delete
        Statement stm = con.createStatement();

        // Step 5 using statement object executeQuery()
        ResultSet rs = stm.executeQuery(query);

        // Step 6 i'm using resultset object to get the data from the query
        while (rs.next()) {
            System.out.println(rs.getString("sname"));
            System.out.println(rs.getInt("Sid"));
            System.out.println(rs.getString("Major"));
        }

        // Step 7 close the database connection for security purpose
        con.close();


    }
}
