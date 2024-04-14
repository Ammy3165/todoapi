package com.amrendra.weather.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Temp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Float tempId;
    private String tempValue;

    public Temp() {
    }


    public Temp(Float tempId, String tempValue) {
        this.tempId = tempId;
        this.tempValue = tempValue;
    }

    public Float getTempId() {
        return tempId;
    }

    public void setTempId(Float tempId) {
        this.tempId = tempId;
    }

    public String getTempValue() {
        return tempValue;
    }

    public void setTempValue(String tempValue) {
        this.tempValue = tempValue;
    }
}
