package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Person {

    private String name="yash";
    private Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle1")Vehicle v)
    {
        // here if we dont mention anyting it will find the primary type bean for vehcile
        // nd autowired that if we dont have primary bean then it will throw error for that
        // @Qualifier is uesd which will mention bean name so that thant only will be autowired
        this.vehicle=v;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public Vehicle getVehicle()
    {
        return this.vehicle;
    }
    public void setVehicle(Vehicle v)
    {
        this.vehicle=v;
    }
}
