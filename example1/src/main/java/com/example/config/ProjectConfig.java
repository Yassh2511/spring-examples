package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// this will let IOC contaniner to anaylzer all the information in the class
@Configuration
public class ProjectConfig
{
    @Bean
    Vehicle vehicle()    {
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    String hello()
    {
        return "Hello world";
    }

    @Bean
    Integer number()
    {
        return 16;
    }
}
