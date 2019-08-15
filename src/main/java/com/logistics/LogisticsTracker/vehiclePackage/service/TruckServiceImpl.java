package com.logistics.LogisticsTracker.vehiclePackage.service;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;
import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;
import com.logistics.LogisticsTracker.vehiclePackage.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TruckServiceImpl implements TruckService {

    private TruckRepository repository;

    @Autowired
    public TruckServiceImpl(TruckRepository repository){
        this.repository = repository;
    }

    @Override
    public List getAllTrucks() {

        List<Truck> trucks = new ArrayList<>();
        repository.findAll().forEach(t->trucks.add(t));
        return trucks;
    }

    @Override
    public Truck getTruckById(long id) {

        Truck truck = repository.findById(id).get();

        return truck;
    }

    @Override
    public Truck getTruckByPlateNumber(String plateNumber) {

        List<Truck> trucks = repository.findByTruckPlateNumber(plateNumber);

        return trucks.get(0);

    }

    @Override
    public boolean saveTruck(Truck truck) {

        try {
            repository.save(truck);
            return true;
        } catch (Exception ex){
            return false;
        }

    }

    @Override
    public boolean deleteTruckById(long id) {

        try {
            repository.deleteById(id);
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    @Override
    public boolean setTrailer(Truck truck,Trailer trailer) {
        truck.setTrailer(trailer);

        return saveTruck(truck);
    }
}
