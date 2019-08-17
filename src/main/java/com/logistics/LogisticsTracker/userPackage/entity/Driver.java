package com.logistics.LogisticsTracker.userPackage.entity;

import com.logistics.LogisticsTracker.tourPackage.entity.Fuel;
import com.logistics.LogisticsTracker.tourPackage.entity.Tour;
import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Driver extends User {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToOne
    @JoinColumn(name = "truck_id")
    private Truck defaultTruck;

    @OneToMany(mappedBy = "driver")
    private Set<Fuel> fuels;

    @OneToMany(mappedBy ="driver")
    private Set<Tour> tours;


}
