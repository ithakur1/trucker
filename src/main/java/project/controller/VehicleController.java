package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import project.entity.Vehicle;
import project.service.VehicleService;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.GET , value = "/vehicles" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> findAll(){
        return vehicleService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/vehicles/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle findOne(@PathVariable("id") String vehId){
        return vehicleService.findOne(vehId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/vehicles" , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle create(@RequestBody Vehicle vehicle){
        return vehicleService.create(vehicle);
    }
}
