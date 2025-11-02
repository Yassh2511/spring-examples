package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person {

    private String name = "Yash";
    private Vehicle vehicle;
    private IdProof idProof;

    @Autowired
    Person(Vehicle v,IdProof p) {
        System.out.println("Person bean created");
        this.vehicle = v;
        this.idProof = p;
    }


    public String getName() {
        return name;
    }

}

