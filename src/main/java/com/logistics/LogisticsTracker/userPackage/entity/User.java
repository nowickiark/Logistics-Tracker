package com.logistics.LogisticsTracker.userPackage.entity;

import com.logistics.LogisticsTracker.vehiclePackage.entity.Truck;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "user", catalog = "logisticsdata")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;

    @OneToOne
    @JoinColumn(name = "truck_id")
    private Truck defaultTruck;

    public User(){};

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Truck getDefaultTruck() {
        return defaultTruck;
    }

    public void setDefaultTruck(Truck defaultTruck) {
        this.defaultTruck = defaultTruck;
    }
}
