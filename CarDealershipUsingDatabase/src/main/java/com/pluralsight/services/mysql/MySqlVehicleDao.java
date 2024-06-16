package com.pluralsight.services.mysql;

import com.pluralsight.models.Vehicle;
import com.pluralsight.services.VehicleDao;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlVehicleDao implements VehicleDao {

    private DataSource dataSource;

    public MySqlVehicleDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = new ArrayList<>();

        try (Connection connection = dataSource.getConnection()) {
            String sql = """
                    SELECT VIN
                    , Year
                    , Make
                    , Model
                    ,VehicleType
                    ,color
                    ,Odometer
                    , price
                    FROM vehicles;
                    """;

            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);

            while (row.next()) {
                String vin = row.getString("VIN");
                int year = row.getInt("Year");
                String make = row.getString("Make");
                String model = row.getString("Model");
                String vehicleType = row.getString("VehicleType");
                String color = row.getString("color");
                int odometer = row.getInt("Odometer");
                double price = row.getDouble("price");

                vehicles.add(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehicles;
    }

    @Override
    public List<Vehicle> searchByModel(String model) {
        List<Vehicle> vehicles = new ArrayList<>();

        String modelSearch = "%" + model + "%";

        try (Connection connection = dataSource.getConnection()) {
            String sql = """
                    SELECT VIN
                    , Year
                    , Make
                    , Model
                    ,VehicleType
                    ,color
                    ,Odometer
                    , price
                    FROM vehicles
                    WHERE Model LIKE ?;
                    """;

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, modelSearch);
            ResultSet row = statement.executeQuery();

            while (row.next()) {
                String vin = row.getString("VIN");
                int year = row.getInt("Year");
                String make = row.getString("Make");
                 model = row.getString("Model");
                String vehicleType = row.getString("VehicleType");
                String color = row.getString("color");
                int odometer = row.getInt("Odometer");
                double price = row.getDouble("price");

                vehicles.add(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehicles;
    }

    @Override
    public List<Vehicle> searchByColor(String color) {
        List<Vehicle> vehicles = new ArrayList<>();

        String modelSearch = "%" + color + "%";

        try (Connection connection = dataSource.getConnection()) {
            String sql = """
                    SELECT VIN
                    , Year
                    , Make
                    , Model
                    ,VehicleType
                    ,color
                    ,Odometer
                    , price
                    FROM vehicles
                    WHERE color LIKE ?;
                    """;

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, modelSearch);
            ResultSet row = statement.executeQuery();

            while (row.next()) {
                String vin = row.getString("VIN");
                int year = row.getInt("Year");
                String make = row.getString("Make");
                String model = row.getString("Model");
                String vehicleType = row.getString("VehicleType");
                 color = row.getString("color");
                int odometer = row.getInt("Odometer");
                double price = row.getDouble("price");

                vehicles.add(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehicles;
    }

    @Override
    public List<Vehicle> searchByType(String vehicleType) {
        List<Vehicle> vehicles = new ArrayList<>();

        String modelSearch = "%" + vehicleType + "%";

        try (Connection connection = dataSource.getConnection()) {
            String sql = """
                    SELECT VIN
                    , Year
                    , Make
                    , Model
                    ,VehicleType
                    ,color
                    ,Odometer
                    , price
                    FROM vehicles
                    WHERE Model LIKE ?;
                    """;

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, modelSearch);
            ResultSet row = statement.executeQuery();

            while (row.next()) {
                String vin = row.getString("VIN");
                int year = row.getInt("Year");
                String make = row.getString("Make");
                String model = row.getString("Model");
                vehicleType = row.getString("VehicleType");
                String color = row.getString("color");
                int odometer = row.getInt("Odometer");
                double price = row.getDouble("price");

                vehicles.add(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehicles;
    }

    @Override
    public Void addVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public Void removeVehicle(String vin) {
        return null;
    }
}
