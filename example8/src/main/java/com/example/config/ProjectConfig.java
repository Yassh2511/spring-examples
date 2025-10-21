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
    vehicle by invoking the vehicle() bean method from person() bean method

    Spring will make sure to have only1 vehicle bean is created and also vehicle bean will be created first always as person bean
    has dependency on it
    */
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("yash");
        person.setVehicle(vehicle());
        return person;
    }
}
