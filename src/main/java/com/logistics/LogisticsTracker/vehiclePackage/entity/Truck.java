package com.logistics.LogisticsTracker.vehiclePackage.entity;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;

import javax.persistence.*;

@Entity
@Table(name = "truck",catalog = "logisticsdata")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String truckPlateNumber;

    @OneToOne
    @JoinColumn(name = "trailer_id")
    private Trailer trailer;
    private long kilometersStatus;


/*    More truck details like:
    - horsepower
    - date of last diagnostic
    - list of replaced parts
    - Insurence
    - Petrol cards
    - Highway tolls
    */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTruckPlateNumber() {
        return truckPlateNumber;
    }

    public void setTruckPlateNumber(String truckPlateNumber) {
        this.truckPlateNumber = truckPlateNumber;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public long getKilometersStatus() {
        return kilometersStatus;
    }

    public void setKilometersStatus(long kilometersStatus) {
        this.kilometersStatus = kilometersStatus;
    }
}
