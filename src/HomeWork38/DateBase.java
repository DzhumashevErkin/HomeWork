package HomeWork38;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DateBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
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

    public static int getStudentsHavingChar() {
        String sql = "select COUNT(*) from students where lower(full_name) like '%a%'";
        List<String> students = new ArrayList<>();
        int count = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                count = rs.getInt(1);
//                students.add(""+rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | " + rs.getDate(4));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static boolean insertCountry(int id, String name, int countryCode, int countryPopulation, String officialLanguage) {
        String sql = "INSERT INTO countries(id,name,country_code,country_population,official_language) " +
                "values(?, ?, ?, ?, ?)";
        int result = 0;
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, countryCode);
            stmt.setInt(4, countryPopulation);
            stmt.setString(5, officialLanguage);

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result > 0;
    }


    public static boolean insertCity(int id, String name, int country_id, int cityPopulation) {
        String sql = "INSERT INTO cities(id,name,country_id,city_population) " +
                "values(?, ?, ?, ?)";
        int result = 0;
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, country_id);
            stmt.setInt(4, cityPopulation);

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result > 0;
    }

    public static List<City> getCitiesWithCountries() {
        String sql = "select * from cities c " +
                "join countries c2 on c.country_id = c2.id;";
        List<City> cities = new ArrayList<>();

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Country country = new Country();
                country.setId(rs.getInt(6));
                country.setName(rs.getString(7));
                country.setCountryCode(rs.getInt(8));
                country.setCountryPopulation(rs.getInt(9));
                country.setOfficialLanguage(rs.getString(11));

                City city = new City();
                city.setId(rs.getInt(1));
                city.setName(rs.getString(2));
                city.setCountry(country);
                city.setCityPopulation(rs.getInt(5));

                cities.add(city);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return cities;
    }

    public static boolean addCitiesArray(List<City> cities) {
        String sql = "INSERT INTO cities(id,name,country_id,city_population) " +
                "values(?, ?, ?, ?)";
        int result = 0;
        for (City city : cities) {
            try (Connection conn = connect();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, city.getId());
                stmt.setString(2, city.getName());
                if (city.getCountry() != null) stmt.setInt(3, city.getCountry().getId());
                else stmt.setInt(3, 1);
                stmt.setInt(4, city.getCityPopulation());

                result = stmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return result > 0;
    }

    public static boolean addCitiesArrayWithReplace(List<City> cities) {
        String sql = "INSERT INTO cities(id,name,country_id,city_population) " +
                "values(?, ?, ?, ?)";
        int result = 0;
        for (City city : cities) {
            try (Connection conn = connect();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, city.getId());
                stmt.setString(2, city.getName());
                if (city.getCountry() != null) stmt.setInt(3, city.getCountry().getId());
                else stmt.setInt(3, 1);
                stmt.setInt(4, city.getCityPopulation());

                result = stmt.executeUpdate();
            } catch (SQLException ex) {
                int countryId = 1;
                if (city.getCountry() != null) countryId = city.getCountry().getId();

                String sql2 = "UPDATE cities SET name = ?"
                        + ",country_id = ?"
                        + ",city_population = ?"
                        + "WHERE id = ?;";
                try (Connection conn = connect();
                     PreparedStatement stmt = conn.prepareStatement(sql2)) {
                    stmt.setInt(4, city.getId());
                    stmt.setString(1, city.getName());
                    if (city.getCountry() != null) stmt.setInt(2, countryId);
                    else stmt.setInt(2, 1);
                    stmt.setInt(3, city.getCityPopulation());

                    result = stmt.executeUpdate();
                } catch (SQLException ex2) {
                    System.out.println(ex2.getMessage());
                }
                System.out.println(ex.getMessage());
            }
        }
        return result > 0;
    }

    public static boolean insertCitySupervisor(int id, String name, int cityId) {
        String sql = "insert into city_supervisor(id,name,city_id) " +
                "values(?,?,?)";
        int result = 0;
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, cityId);

            result = stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result > 0;

    }

}

