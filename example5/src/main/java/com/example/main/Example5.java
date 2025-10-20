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



    }
}
