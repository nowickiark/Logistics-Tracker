package com.logistics.LogisticsTracker.vehiclePackage.controller;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;
import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;
import com.logistics.LogisticsTracker.vehiclePackage.service.TrailerService;
import com.logistics.LogisticsTracker.vehiclePackage.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TruckController {

    private TruckService truckService;
    private TrailerService trailerService;

    @Autowired
    public TruckController(TruckService truckService, TrailerService trailerService){this.truckService = truckService; this.trailerService = trailerService;}

    @RequestMapping("/saveTruck")
    @ResponseBody
    public Truck saveTruck(@RequestBody Truck truck){

        System.out.println(truckService.saveTruck(truck));

        return truck;
    }

    @RequestMapping("/getAllTrucks")
    @ResponseBody
    public List showTrucks(){
        return truckService.getAllTrucks();
    }

    @RequestMapping("/addTrailerToTruck")
    @ResponseBody
    public boolean addTrailerToTruck(@RequestParam("truck_id") long truck_id,
                                     @RequestParam("trailer_id") long trailer_id){

        Trailer trailer = trailerService.getTrailerById(trailer_id);
        Truck truck = truckService.getTruckById(truck_id);

        return truckService.setTrailer(truck,trailer) && trailerService.setTruck(trailer,truck);

    }



}
