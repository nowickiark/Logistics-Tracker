package com.logistics.LogisticsTracker.vehiclePackage.repository;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends CrudRepository<Truck,Long> {
}
