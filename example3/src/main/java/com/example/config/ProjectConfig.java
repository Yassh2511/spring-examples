package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProjectConfig
{

    /* we can create custom bean name instead of using default method
       name bean name in 3 ways
     */
    @Bean(name="audiBean")
    Vehicle vehicle1()    {
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(value="hondaBean")
    Vehicle vehicle2()
    {
        var veh=new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("benzBean")
    Vehicle vehicle3()
    {
        var beh=new Vehicle();
        beh.setName("Benz");
        return beh;
    }
}
