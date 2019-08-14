package com.logistics.LogisticsTracker.vehiclePackage.service;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;
import com.logistics.LogisticsTracker.vehiclePackage.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class TruckServiceImpl implements TruckService {

/*    private TruckRepository truckRepository;

    @Autowired
    public TruckServiceImpl(TruckRepository truckRepository){
        this.truckRepository = truckRepository;
    }*/

    @Override
    public List getAllTrucks() {
        return null;
    }

    @Override
    public Truck getTruckById(long id) {
        return null;
    }

    @Override
    public Truck getTruckByPlateNumber(String plateNumber) {
        return null;
    }

    @Override
    public boolean saveTruck(Truck truck) {
        return false;
    }

    @Override
    public boolean delateTruckById(long id) {
        return false;
    }
}
