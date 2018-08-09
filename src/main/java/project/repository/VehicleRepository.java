package project.repository;

import project.entity.Vehicle;

import java.util.List;

public interface VehicleRepository {

    List<Vehicle> findAll();

    Vehicle findOne(String id);

    Vehicle create(Vehicle vehicle);
}
