package com.logistics.LogisticsTracker.vehiclePackage.repository;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrailerRepository extends CrudRepository<Trailer, Long> {
}
