package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DateBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "310898021194";

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

    public static int getTrainersCount() {
        String sql = "SELECT count(*) FROM treners";
        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return count;
    }

    public static int getStudentsHavingChar(){
        String sql = "select COUNT(*) from students where lower(full_name) like '%a%'";
        List<String> students = new ArrayList<>();
        int count = 0;
        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                count = rs.getInt(1);
//                students.add(""+rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | " + rs.getDate(4));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return count;
    }



}
