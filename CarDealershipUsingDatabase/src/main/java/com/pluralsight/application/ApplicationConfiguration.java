package com.pluralsight.application;

import com.pluralsight.services.DealershipDao;
import com.pluralsight.services.VehicleDao;
import com.pluralsight.services.mysql.MySqlDealershipDao;
import com.pluralsight.services.mysql.MySqlVehicleDao;
import com.pluralsight.views.Homeview;
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

    //views
    public Homeview homeview = new Homeview();
}
