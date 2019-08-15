package com.logistics.LogisticsTracker.vehiclePackage.repository;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrailerRepository extends CrudRepository<Trailer, Long> {

    List<Trailer> findByTrailerPlateNumber(String trailerPlateNumber );

}
