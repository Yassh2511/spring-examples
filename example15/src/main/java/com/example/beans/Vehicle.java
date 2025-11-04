package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle
{
    private String name="Audi";
    private VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices)
    {
        this.vehicleServices=vehicleServices;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

}
