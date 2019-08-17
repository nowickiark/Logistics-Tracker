package com.logistics.LogisticsTracker.tourPackage.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.logistics.LogisticsTracker.userPackage.entity.Driver;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @OneToMany(mappedBy = "tour")
    private List<Fuel> fuels;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateOfStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateOfEnd;

    private long stratingKilometer;
    private long endingKilometer;
    private int daysOfHalt;

/*
    private Set<Job> jobList;
    private Set<ExtraCost> extraCosts;*/


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Fuel> getFuels() {
        return fuels;
    }

    public void setFuels(List<Fuel> fuels) {
        this.fuels = fuels;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(LocalDate dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public long getStratingKilometer() {
        return stratingKilometer;
    }

    public void setStratingKilometer(long stratingKilometer) {
        this.stratingKilometer = stratingKilometer;
    }

    public long getEndingKilometer() {
        return endingKilometer;
    }

    public void setEndingKilometer(long endingKilometer) {
        this.endingKilometer = endingKilometer;
    }

    public int getDaysOfHalt() {
        return daysOfHalt;
    }

    public void setDaysOfHalt(int daysOfHalt) {
        this.daysOfHalt = daysOfHalt;
    }
}
