package com.pluralsight.services.mysql;

import com.pluralsight.models.Vehicle;
import com.pluralsight.services.VehicleDao;

import javax.sql.DataSource;
import java.util.List;

public class MySqlVehicleDao implements VehicleDao {

    private DataSource dataSource;

    public MySqlVehicleDao(DataSource dataSource)
    {this.dataSource = dataSource;}

    @Override
    public List<Vehicle> getAll() {
        return List.of();
    }
}
