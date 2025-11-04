package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.beans.VehicleServices;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example15
{
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleServices v1=context.getBean(VehicleServices.class);
        VehicleServices v2=context.getBean(VehicleServices.class);
        if(v1==v2)System.out.println("Bean scope is singleton");
        else System.out.println("Bean scope is Prototype");


        // Here vehicle bean created will print 3 time beacause along with creation of
        // Vehicle bean there is also creation of person bean as person bean has singleton scope
        // so after starting it will create vehicle bean but vehicle beat is autowired to vehicleservices bean thats why vehcilesercices bean is also
        // created thats why it will print 3 times even if we call it 2 times
    }
}
