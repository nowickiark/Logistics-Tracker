package com.logistics.LogisticsTracker.tourPackage.entity;

import com.logistics.LogisticsTracker.userPackage.entity.Driver;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @OneToMany(mappedBy = "fuel_id")
    private List<Fuel> fuels;


/*    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;
    private Driver driver;
    private Truck truck;
    private long stratingKilometer;
    private long endingKilometer;
    private int daysOfHalt;
    private Set<Job> jobList;
    private Set<Fuel> fuelList;
    private Set<ExtraCost> extraCosts;*/
}
