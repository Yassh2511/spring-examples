package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleServices {

    Speakers speaker;
    Tyres tyre;

    @Autowired
    VehicleServices(Speakers speaker, Tyres tyre)
    {
        System.out.println("Vehicleservices bean created");
        this.speaker=speaker;
        this.tyre=tyre;
    }

    public Speakers getSpeaker()
    {
        return speaker;
    }

    public Tyres getTyres()
    {
        return tyre;
    }

}
