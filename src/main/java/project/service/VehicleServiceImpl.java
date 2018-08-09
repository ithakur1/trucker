package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.entity.Vehicle;
import project.exception.BadRequestException;
import project.repository.VehicleRepository;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;


    @Transactional(readOnly = true)
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Vehicle findOne(String id) {
        return vehicleRepository.findOne(id);
    }

    @Transactional
    public Vehicle create(Vehicle vehicle) {
        Vehicle existing = vehicleRepository.findOne(vehicle.getVin());
        if(existing!= null){
            throw new BadRequestException("Vehicle with the vin " + vehicle.getVin()+ "already exists");
        }
        return vehicleRepository.create(vehicle);
    }
}
