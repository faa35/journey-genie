package com.genie.journey_genie.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Preferences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int duration;
    private boolean tolls;
    private String location;
    private float range;
    private String interests;

    public Preferences() {

    }

    public Preferences(int duration, boolean tolls, String location, float range, String interests) {
        this.duration = duration;
        this.tolls = tolls;
        this.location = location;
        this.range = range;
        this.interests = interests;
    }

    
    public int getId() {
        return id;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public boolean allowTolls() {
        return tolls;
    }
    public void setTolls(boolean tolls) {
        this.tolls = tolls;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getInterests() {
        return interests;
    }
    public void setInterests(String interests) {
        this.interests = interests;
    }
    public float getRange() {
        return range;
    }
    public void setRange(float range) {
        this.range = range;
    }
    
    
}
