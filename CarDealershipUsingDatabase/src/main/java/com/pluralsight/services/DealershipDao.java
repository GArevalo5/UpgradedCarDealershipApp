package com.pluralsight.services;

import com.pluralsight.models.Dealership;

import java.util.List;

public interface DealershipDao {
    List<Dealership> getAll();
}
