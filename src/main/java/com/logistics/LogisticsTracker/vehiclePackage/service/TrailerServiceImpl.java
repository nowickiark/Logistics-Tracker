package com.logistics.LogisticsTracker.vehiclePackage.service;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;
import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;
import com.logistics.LogisticsTracker.vehiclePackage.repository.TrailerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrailerServiceImpl implements TrailerService {


    TrailerRepository repository;

    @Autowired
    public TrailerServiceImpl (TrailerRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Trailer> getAllTrailers() {

        List<Trailer> trailers = new ArrayList<>();
        repository.findAll().forEach(t->trailers.add(t));
        return trailers;
    }

    @Override
    public Trailer getTrailerById(long id) {

        Trailer trailer = repository.findById(id).get();

        return trailer;
    }

    @Override
    public Trailer getTrailerByPlateNumber(String plateNumber) {

        List<Trailer> byTrailerPlateNumber = repository.findByTrailerPlateNumber(plateNumber);

        return byTrailerPlateNumber.get(0);
    }

    @Override
    public boolean saveTrailer(Trailer trailer) {

        try{
            repository.save(trailer);
            return true;
        } catch (Exception ex){
            return false;
        }

    }

    @Override
    public boolean deleteTrailerById(long id) {

        try {
            repository.deleteById(id);
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    @Override
    public boolean setTruck(Trailer trailer, Truck truck) {
        trailer.setTruck(truck);
        return saveTrailer(trailer);
    }


}
