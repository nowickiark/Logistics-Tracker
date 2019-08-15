package com.logistics.LogisticsTracker.vehiclePackage.controller;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;
import com.logistics.LogisticsTracker.vehiclePackage.service.TrailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public Trailer saveTrailer(@RequestParam("trailer_plate_number") String trailerPlateNumber,
                               @RequestParam("lenght") double lenght,
                               @RequestParam("width") double width,
                               @RequestParam("hight") double hight){

        Trailer trailer = new Trailer();
        trailer.setTrailerPlateNumber(trailerPlateNumber);
        trailer.setLenght(lenght);
        trailer.setWidgh(width);
        trailer.setHight(hight);

        System.out.println(trailerService.saveTrailer(trailer));

        return trailer;

    }

}
