package com.logistics.LogisticsTracker.vehiclePackage.repository;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TruckRepository extends CrudRepository<Truck,Long> {

    List<Truck> findByTruckPlateNumber(String truckPlateNumber);

}
