package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person {

    private String name = "Yash";
    private Vehicle vehicle;

    @Autowired
    Person(Vehicle v) {
        System.out.println("Person bean created");
        this.vehicle = v;
    }

    public String getName() {
        return name;
    }

}

