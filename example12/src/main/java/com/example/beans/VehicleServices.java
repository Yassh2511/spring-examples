package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    Speakers speaker;
    Tyres tyre;

    @Autowired
    VehicleServices(Speakers speaker, Tyres tyre)
    {
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
