package com.logistics.LogisticsTracker.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

public class Tour {

    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;
    private Driver driver;
    private Truck truck;
    private long stratingKilometer;
    private long endingKilometer;
    private int daysOfHalt;
    private Set<Job> jobList;
    private Set<Fuel> fuelList;
    private Set<ExtraCost> extraCosts;
}
