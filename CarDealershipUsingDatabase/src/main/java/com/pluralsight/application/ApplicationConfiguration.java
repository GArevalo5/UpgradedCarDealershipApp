package com.pluralsight.application;

import com.pluralsight.controllers.VehicleController;
import com.pluralsight.services.DealershipDao;
import com.pluralsight.services.VehicleDao;
import com.pluralsight.services.mysql.MySqlDealershipDao;
import com.pluralsight.services.mysql.MySqlVehicleDao;
import com.pluralsight.views.*;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfiguration {

    public final DataSource dataSource = buildDataSource();

    private DataSource buildDataSource() {
        try (FileInputStream stream = new FileInputStream("src/main/resources/config.properties")) {
            Properties properties = new Properties();
            properties.load(stream);

            String connectionString = properties.getProperty("db.connectionString");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            BasicDataSource basicDataSource = new BasicDataSource();
            basicDataSource.setUrl(connectionString);
            basicDataSource.setUsername(username);
            basicDataSource.setPassword(password);

            return basicDataSource;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //daos
    public DealershipDao dealershipDao = new MySqlDealershipDao(dataSource);
    public VehicleDao vehicleDao = new MySqlVehicleDao(dataSource);

    //controllers
    public VehicleController vehicleController = new VehicleController(vehicleDao);

    //views
    public HomeView homeview = new HomeView();
    public DisplayAllVehiclesView displayAllVehiclesView = new DisplayAllVehiclesView();
    public VehicleColorView vehicleColorView = new VehicleColorView();
    public VehicleTypeView vehicleTypeView = new VehicleTypeView();
    public VehicleModelView vehicleModelView = new VehicleModelView();



}
