package project.repository;

import org.springframework.stereotype.Repository;
import project.entity.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Vehicle> findAll() {
        TypedQuery<Vehicle> query = entityManager.createQuery("select vehicle from Vehicle vehicle order by vehicle.vin desc", Vehicle.class);
        List<Vehicle> result = query.getResultList();
        return result;
    }

    @Override
    public Vehicle findOne(String id) {
        return entityManager.find(Vehicle.class, id);
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        entityManager.persist(vehicle);
        return vehicle;
    }
}
