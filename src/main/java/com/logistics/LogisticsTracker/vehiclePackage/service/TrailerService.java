package com.logistics.LogisticsTracker.vehiclePackage.service;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;
import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;

import java.util.List;

public interface TrailerService {

    List<Trailer> getAllTrailers();
    Trailer getTrailerById(long id);
    Trailer getTrailerByPlateNumber(String plateNumber);
    boolean saveTrailer(Trailer trailer);
    boolean deleteTrailerById(long id);
    boolean setTruck(Trailer trailer, Truck truck);


}
