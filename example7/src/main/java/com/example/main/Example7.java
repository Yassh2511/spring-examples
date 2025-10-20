package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example7
{
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        // Even if we have written @ComponentScan in projectconfig it will not create any beans
        // By its own as there is nothing any component present inside the vehicle class


        Supplier<Vehicle> hondaSupplier=()->{
            Vehicle honda=new Vehicle();
            honda.setName("Honda");
            return honda;
        };

        // This is kind a supplier function when we want any bean according to the condtion this will execute only then
        // That means instead direct creating object spring can instianitate or handle this object accordingly

        Supplier<Vehicle> audiSupplier=()->{
            Vehicle audi=new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random=new Random();
        int randomNumber=random.nextInt(10);
        System.out.println("Random number is:"+randomNumber);
        if(randomNumber%2==0)
        {
            context.registerBean("honda",Vehicle.class,hondaSupplier);
        }
        else
        {
            context.registerBean("audi",Vehicle.class,audiSupplier);
        }

        Vehicle hondaVehicle=null;
        Vehicle audiVehicle=null;

        try
        {
            hondaVehicle=context.getBean("honda",Vehicle.class);
        }
        catch(NoSuchBeanDefinitionException n)
        {
            System.out.println("No hondaVehicle bean is created");
        }
        try
        {
            System.out.println("yet no obj");
            audiVehicle=context.getBean("audi",Vehicle.class);
        }
        catch(NoSuchBeanDefinitionException n)
        {
            System.out.println("No audiVehicle bean is created");
        }

        if(hondaVehicle!=null)
        {
            System.out.println("Bean created is of:"+hondaVehicle.getName());
        }
        else if(audiVehicle!=null)
        {
            System.out.println("Bean created is of :"+audiVehicle.getName());
        }
    }
}
