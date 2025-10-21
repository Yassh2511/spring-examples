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
    public Person(Vehicle v)
    {
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
