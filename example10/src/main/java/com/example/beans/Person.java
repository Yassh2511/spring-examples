package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Person {

    private String name;
    // Here we use @AuotWired on the top of the field
    // @AutoWired(required=false) it will not give exception if it not found any vehicle bean
    // using autowired above field then we cant make field final
    //@Autowired
    private Vehicle vehicle;


    // AUtowired using constructor
    // and doing this we also can make field vehcile final
    // If there is only one constructor prsent inside the class writing @Autowired is optional
    @Autowired
    public Person(Vehicle v)
    {
        this.vehicle=v;
    }
    @PostConstruct
    public void init()
    {
        System.out.println("Enter person name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        this.name=name;
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

    // here autowired is used on top of the setter method
    //@Autowired
    public void setVehicle(Vehicle v)
    {
        this.vehicle=v;
    }
}
