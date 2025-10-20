// This Example is about using @PostConstruct and @PreDestroy annotation

package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6
{
    public static void main(String[] args) {



        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        // This will initialize all the spring context and spring container
        Vehicle vehicle1=context.getBean(Vehicle.class);

        System.out.println("Vehicle name using spring beans is:"+vehicle1.getName());
        // Here if we dont use @PostConstruct annotation then it will print null because
        // we dont have any control on the beans so nothing is initalized to the name of the vehcile
        // But as we use @PostConstruct annotation it will give us leverage to initalize it

        context.close();
    }
}
