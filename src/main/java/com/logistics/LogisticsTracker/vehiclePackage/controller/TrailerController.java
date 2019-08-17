package com.logistics.LogisticsTracker.vehiclePackage.controller;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;
import com.logistics.LogisticsTracker.vehiclePackage.service.TrailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TrailerController {

    private TrailerService trailerService;

    @Autowired
    public TrailerController(TrailerService trailerService) {
        this.trailerService = trailerService;
    }

    @RequestMapping("/saveTrailer")
    @ResponseBody
    public Trailer saveTrailer(@RequestBody Trailer trailer){

        System.out.println(trailerService.saveTrailer(trailer));

        return trailer;

    }

}
