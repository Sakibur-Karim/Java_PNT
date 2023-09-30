package com.sqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "12345678";
        String query = "delete from student where sname = 'Sofiane';";

        Connection con = DriverManager.getConnection(url, username, password);

        Statement stm = con.createStatement();

        stm.executeUpdate(query);

        System.out.println("It's good");

        con.close();
        stm.close();


    }
}
