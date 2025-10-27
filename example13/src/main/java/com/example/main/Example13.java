// This example is about scope of the bean
// First Singletone scope bean
package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13
{
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehcile1=context.getBean(Vehicle.class);
        Vehicle vehcile2=context.getBean(Vehicle.class);

        System.out.println("Hashcode of v1 is:"+vehcile1.hashCode());
        System.out.println("HashCode of v2 is "+vehcile2.hashCode());

        if(vehcile1==vehcile2)System.out.println("Bean is singleton");

    }
}
