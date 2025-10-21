/*
In this example we will try to autowiring/wiring between dependent beans so that they can use them
as per need as person have vehcile so this 2 beans must be wired in this example we are using
passing parameter of another bean to the bean in configuration class
 */

package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example9
{
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person=context.getBean(Person.class);
        Vehicle vehicle=context.getBean(Vehicle.class);

        System.out.println("Person name is:"+person.getName());
        System.out.println("vehicle name for "+person.getName()+" is:"+person.getVehicle());
    }
}
