package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1
{
    public static void main(String[] args) {

        // If we not use any spring beans then object will created like this

        Vehicle vehicle=new Vehicle();
        vehicle.setName("Honda city");
        System.out.println("Vehicle is:"+vehicle.getName());

        // Now using spring beans it will create or call spring context on the basis of the
        // class that we will give to the object

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        // This will initialize all the spring context and spring container
        Vehicle vehicle1=context.getBean(Vehicle.class);

        /* we dont need to do any explicit casting while fetching a bean from context
        Spring is smart enough to look for a bean of the type you reuquested in its context.
        If such a bean doesent exist spring will throw an exception
         */
        System.out.println("Vehicle name using spring beans is:"+vehicle1.getName());

        String str=context.getBean(String.class);
        System.out.println("String object uiing spring beans:"+str);
    }
}
