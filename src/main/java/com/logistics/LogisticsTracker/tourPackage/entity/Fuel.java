package com.logistics.LogisticsTracker.tourPackage.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.logistics.LogisticsTracker.model.Currency;
import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;
import com.logistics.LogisticsTracker.userPackage.entity.Driver;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Fuel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private double liters;
    private double totalCostIncVat;
    private Currency currency;
    private long kilometerStatus;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "truck_id")
    private Truck truck;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;

    private boolean fillToFull;

}
