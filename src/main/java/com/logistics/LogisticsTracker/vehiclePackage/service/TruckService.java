package com.logistics.LogisticsTracker.vehiclePackage.service;

import com.logistics.LogisticsTracker.userPackage.entity.User;
import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;

import java.util.List;

public interface TruckService {

    List getAllTrucks();
    Truck getTruckById(long id);
    Truck getTruckByPlateNumber(String plateNumber);
    boolean saveTruck(Truck truck);
    boolean delateTruckById(long id);

}
