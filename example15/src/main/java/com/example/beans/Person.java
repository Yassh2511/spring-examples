package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component(value="personBean")
public class Person {
    private String name;
    private Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle)
    {
        this.vehicle=vehicle;
    }
    @PostConstruct
    public void init()
    {
        Scanner sc=new Scanner(System.in);
        this.name=sc.nextLine();
    }
    public  String getName() {
        return name;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }


}
