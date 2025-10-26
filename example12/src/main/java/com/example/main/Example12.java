package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.beans.VehicleServices;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example12
{
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p=context.getBean(Person.class);
        System.out.println("User name is:"+p.getName());
        Vehicle v=context.getBean(Vehicle.class);
        System.out.println(p.getName()+" Driving "+v.getName()+" car");

        VehicleServices vs=context.getBean(VehicleServices.class);
        vs.getTyres().rotate();
        vs.getSpeaker().makeSound();

    }
}
