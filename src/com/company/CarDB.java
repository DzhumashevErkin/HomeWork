package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CarDB {
    public static Car getCarById(Integer id){
        String sql = "Select * from car_info where car_id = ?";
        Car car = null;
        try(Connection connection = DateBase.connect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);

            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()){
                    car = new Car();
                    car.setCarId(resultSet.getInt("car_id"));
                    car.setColor(resultSet.getString("color"));
                    car.setModel(resultSet.getString("model"));
                    car.setPrice(resultSet.getInt("price"));
                    car.setManufactureYear(resultSet.getInt("manufacture_year"));
                    return car;
                }
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return car;
    }
}
