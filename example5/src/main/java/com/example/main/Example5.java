package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5
{
    public static void main(String[] args) {


        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        //var vehicle1=context.getBean(Vehicle.class);
        //NoUniqueBeanDefinitionException exception for this to overcome this

        var vehicle1=context.getBean(Vehicle.class);
        vehicle1.printVehicle();

        // But as control on object is totally in hand of spring context we dont have control on the
        // object so there is no name to the vehicle as we are not initializing it



    }
}
