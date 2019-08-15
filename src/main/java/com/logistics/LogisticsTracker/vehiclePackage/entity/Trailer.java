package com.logistics.LogisticsTracker.vehiclePackage.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Trailer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String trailerPlateNumber;
    private double lenght;
    private double widgh;
    private double hight;
    private int palletPlaces;

    @OneToOne
    private Truck truck;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTrailerPlateNumber() {
        return trailerPlateNumber;
    }

    public void setTrailerPlateNumber(String trailerPlateNumber) {
        this.trailerPlateNumber = trailerPlateNumber;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidgh() {
        return widgh;
    }

    public void setWidgh(double widgh) {
        this.widgh = widgh;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public int getPalletPlaces() {
        return palletPlaces;
    }

    public void setPalletPlaces(int palletPlaces) {
        this.palletPlaces = palletPlaces;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

}
