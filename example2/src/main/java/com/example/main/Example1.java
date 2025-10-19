package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1
{
    public static void main(String[] args) {


        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        //var vehicle1=context.getBean(Vehicle.class);
        //NoUniqueBeanDefinitionException exception for this to overcome this

        var vehicle1=context.getBean("vehicle1",Vehicle.class);
        var vehicle2=context.getBean("vehicle2",Vehicle.class);
        var vehicle3=context.getBean("vehicle3",Vehicle.class);
        System.out.println("Vehicle1 name using spring beans is:"+vehicle1.getName());
        System.out.println("Vehicle2 name using spring beans is:"+vehicle2.getName());
        System.out.println("Vehicle3 name using spring beans is:"+vehicle3.getName());


    }
}
