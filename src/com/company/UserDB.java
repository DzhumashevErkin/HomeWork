package com.company;

import java.sql.*;
import java.util.Arrays;

public class UserDB {

    public static boolean addUser(User user) {
        String sql = "INSERT INTO \"JV2020_ClassWork42\".users(login,email,password,date_of_registration) " +
                "VALUES(?,?,?,now())";
        int result = 0;

        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result > 0;
    }

    public static User getUserByUsername(String username) {
        String sql = "SELECT * FROM \"JV2020_ClassWork42\".users " +
                "Where login = ? and coalesce(is_blocked, false) = false";
        User user = null;

        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    user = new User();
                    user.setId(rs.getInt("user_id"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    user.setDateOfRegistration((rs.getDate("date_of_registration")));
                    user.setLogin(rs.getString("login"));
                    user.setBlocked(rs.getBoolean("is_blocked"));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return user;
    }

    @SuppressWarnings("Duplicates")
    public static boolean addUserLog(User user, String loginResult) {
        String sql = "insert into \"JV2020_ClassWork42\".user_logs(user_id,login_time,login_result)" +
                "values(?,now(),?);";
        int result = 0;
        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, user.getId());
            stmt.setString(2, loginResult);

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }

//    public static String encodePassword(String password) {
//        String encodePassword = new StringBuilder(password).reverse().toString();
//        encodePassword += encodePassword.charAt(encodePassword.length() - 1);
//        return encodePassword;
//    }

    public static String decodePassword(String password) {
        String decodePassword = new StringBuilder(password).reverse().toString();
        decodePassword = decodePassword.substring(1);
        return decodePassword;
    }

    public static int getUserLogsCountByUserIdAndLoginResult(User user, String loginResult) {
        String sql = "select COUNT(user_log_id) from \"JV2020_ClassWork42\".user_logs " +
                "where user_id = ? and login_result = COALESCE(?, login_result)";
        int result = 0;

        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, user.getId());
            stmt.setString(2, loginResult);
            try (ResultSet rs = stmt.executeQuery()) {
                rs.next();
                result = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public static boolean setUserIsBlockedByUserIdOrUsername(User user, boolean isBlocked) {
        String sql = "UPDATE \"JV2020_ClassWork42\".users SET is_blocked = ? " +
                "WHERE user_id = ? or login = ?";
        int result = 0;

        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, isBlocked);
            stmt.setInt(2, user.getId());
            stmt.setString(3, user.getLogin());

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }
    @SuppressWarnings("Duplicates")
    public static boolean deleteUserLogsByUserIdAndLoginResult(User user, String loginResult) {
        String sql = "DELETE FROM \"JV2020_ClassWork42\".user_logs " +
                "where user_id = ? and login_result = COALESCE(?, login_result)";

        int result = 0;
        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, user.getId());
            stmt.setString(2, loginResult);

            result = stmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result > 0;
    }
}
