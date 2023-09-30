package com.sqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "12345678";
        String query = "insert into MyDB.student values (105, 'Saif', 'Architect');";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);

        Statement stm = con.createStatement();

        stm.executeUpdate(query);

        System.out.println("It's Done!");

        con.close();
        stm.close();
    }
}
