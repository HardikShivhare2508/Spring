package com.example.demo.entity;

import java.util.Date;

public class Flight {


    private String id;
    private String origin;
    private String destination;
    private Date dateOfJourney;

    public Flight() {

    }

    public Flight(String id, String origin, String destination, Date dateOfJourney) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(Date dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }
}
