package com.example.carcollection.model;

import java.util.UUID;

public class Car {

    private final UUID carid;
    private final String carname;
    private final String carmodel;
    private final Integer caryear;

    public Car(UUID carid, String carname, String carmodel, Integer caryear) {
        this.carid = carid;
        this.carname = carname;
        this.carmodel = carmodel;
        this.caryear = caryear;
    }

    public UUID getCarid() {
        return carid;
    }

    public String getCarname() {
        return carname;
    }

    public String getCarmodel(){
        return carmodel;
    }

    public Integer getCaryear(){
        return caryear;
    }
}
