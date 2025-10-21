/*
In this we learn about 3 steps when there is multipl bean present of same type and we want to wire them
 */

package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example11
{
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person=context.getBean(Person.class);
        Vehicle vehicle=context.getBean(Vehicle.class);

        System.out.println("Person name is:"+person.getName());
        System.out.println("vehicle name for "+person.getName()+" is:"+person.getVehicle());
    }
}
