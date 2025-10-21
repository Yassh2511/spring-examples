package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    /*
    Here in the below code we are trying to wire a establish a relationship between person and
    vehicle by passing vehicle v parameter to the person method

    Spring will automatically recognize that this 2 must be wired and it will get wired
    */
    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("yash");
        person.setVehicle(vehicle);
        return person;
    }
}
