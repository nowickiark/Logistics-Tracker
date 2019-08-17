package com.logistics.LogisticsTracker.vehiclePackage.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.logistics.LogisticsTracker.tourPackage.entity.Fuel;
import com.logistics.LogisticsTracker.vehiclePackage.entity.Trailer;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "truck",catalog = "logisticsdata")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String truckPlateNumber;
    private long kilometersStatus;
    private double maxWeight;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateOfLastDiagnostics;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateOfInusrance;

    @OneToOne
    @JoinColumn(name = "trailer_id")
    private Trailer trailer;

    @OneToMany(mappedBy = "truck")
    private Set<Fuel> fuels;


/*    More truck details like:
    - horsepower
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return id == truck.id &&
                kilometersStatus == truck.kilometersStatus &&
                Objects.equals(truckPlateNumber, truck.truckPlateNumber) &&
                Objects.equals(trailer, truck.trailer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, truckPlateNumber, trailer, kilometersStatus);
    }
}
