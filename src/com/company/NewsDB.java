package com.company;

import java.sql.*;

public class NewsDB {
    public static boolean createNews(News news) {
        String sql = "INSERT INTO \"JV2020_Exam4\".news(heading,content,time_publication) " +
                "values(?,?,now())";
        int result = 0;
        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, news.getHeading());
            stmt.setString(2, news.getContent());

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result > 0;
    }

    public static News getNewsById(int id) {
        String sql = "Select * from \"JV2020_Exam4\".news " +
                "WHERE id = ?";
        News news = null;
        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    news = new News();
                    news.setId(rs.getInt("id"));
                    news.setHeading(rs.getString("heading"));
                    news.setContent(rs.getString("content"));
                    news.setTimePublication(rs.getDate("time_publication"));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return news;
    }

    public static boolean deleteNewsById(int id) {
        String sql = "DELETE from \"JV2020_Exam4\".news " +
                "WHERE id = ?";
        int result = 0;
        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }

    public static boolean changeHeadingAndContentInNewsById(int id, String heading, String content) {
        String sql = "UPDATE \"JV2020_Exam4\".news " +
                "SET heading = ?, content = ? " +
                "WHERE id = ?";

        int result = 0;

        try (Connection conn = DateBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, heading);
            stmt.setString(2, content);
            stmt.setInt(3, id);

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result > 0;
    }
}
