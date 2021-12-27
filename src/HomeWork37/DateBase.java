package HomeWork37;

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

    public static List<String> getTrenersWithSalary(){
        String sql = "select t.full_name , st.salary \n" +
                     "from treners t \n" +
                     "join sport_types st on st.sport_type = t.sport_type";
        List<String> list = new ArrayList<>();
        try(Connection conn = connect();
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql)){
            while (rs.next()){
                list.add(rs.getString("full_name") + " | " + rs.getDouble("salary"));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static double getAvgTrenersSalary(){
        String sql = "select avg(st.salary)\n" +
                "from treners t \n" +
                "join sport_types st on st.sport_type = t.sport_type";
        double avgTrenersSalary = 0;
        try(Connection conn = connect();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql)){
            rs.next();
            avgTrenersSalary = rs.getDouble("avg");
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return avgTrenersSalary;
    }

    public static List<String> getTrenersWithGoodIsTrener(){
        String sql = "select full_name,\n" +
                        "case \n" +
                        "when length(full_name) > 3 then 'Молодец'\n" +
                        "else 'Не молодец'\n" +
                        "END\n" +
                        "as is_good\n" +
                        "from treners";
        List<String> list = new ArrayList<>();
        try(Connection conn = connect();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql)){
            while (rs.next()){
                list.add(rs.getString("full_name") + " | " + rs.getString("is_good"));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static void getCountStudentsInGroup(){
        String sql = "select g.code , count(s.id) \n" +
                "from groupss g \n" +
                "inner join students s on s.group_id = g.id \n" +
                "group by g.code";
        try(Connection conn = connect();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql)){
            while (rs.next()){
                System.out.println("В группе " + rs.getString("code") + " | " + rs.getInt("count") + " студентов");
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

}
