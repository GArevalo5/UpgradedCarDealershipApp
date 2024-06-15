package com.pluralsight.services.mysql;

import com.pluralsight.models.Dealership;
import com.pluralsight.services.DealershipDao;

import javax.sql.DataSource;
import java.util.List;

public class MySqlDealershipDao implements DealershipDao {
    private DataSource dataSource;

    public MySqlDealershipDao(DataSource dataSource)
    {this.dataSource = dataSource;}

    @Override
    public List<Dealership> getAll() {
        return List.of();
    }
}
