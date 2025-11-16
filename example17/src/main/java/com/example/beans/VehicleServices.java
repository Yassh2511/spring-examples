package com.example.beans;

import com.example.Interfaces.Speakers;
import com.example.Interfaces.Tyres;
import com.example.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleServices
{
    private Logger logger=Logger.getLogger(VehicleServices.class.getName());

    @Autowired
    Speakers speaker;
    @Autowired
    Tyres tyre;


    // In this way using AOP out program no of lines shifts from 15 to 3 for each method
    public String playSong(boolean vehicleStarted, Song song)
    {
        return speaker.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted)
    {
        return tyre.rotate();
    }
    public String stopVehicle(boolean vehicleStarted)
    {
        return tyre.stop();
    }
}
