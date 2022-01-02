package com.company;


import java.sql.*;

public class DateBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=JV2020_ClassWork42";
    private static final String user = "postgres";
    private static final String password = "123";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
