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

    public String playSong(boolean vehicleStarted, Song song)
    {
        Instant start= Instant.now();
        logger.info("Method execution started");
        String music=null;
        if(vehicleStarted)
        {
            music=speaker.makeSound(song);
        }
        else
        {
            logger.log(Level.SEVERE,"Vehicle not started to perform the operation");
        }
        logger.info("Method execution finished");
        Instant end=Instant.now();

        long timeElapsed= Duration.between(start,end).toMillis();
        logger.info("Method execution tine is-"+timeElapsed);

        return music;
    }

    public String moveVehicle(boolean vehicleStarted)
    {
        Instant start=Instant.now();
        logger.info("Method execution started");
        String status=null;
        if(vehicleStarted)
        {
            status=tyre.rotate();
        }
        else
        {
            logger.log(Level.SEVERE,"cant move vehicle vehicle isn't started yet");
        }
        logger.info("Method execution is ended");
        Instant end=Instant.now();

        long timeElapsed=Duration.between(start,end).toMillis();
        logger.info("Method execution time is:"+timeElapsed);

        return status;
    }
    public String stopVehicle(boolean vehicleStarted)
    {
        Instant start=Instant.now();
        logger.info("Method execution started");
        String status=null;
        if(vehicleStarted)
        {
            status=tyre.stop();
        }
        else
        {
            logger.log(Level.SEVERE,"Vehicle yet not started so it cant be stopped");
        }
        logger.info("Method execution stopped");
        Instant end=Instant.now();

        long timeElapsed=Duration.between(start,end).toMillis();

        logger.info("Time elapsed for this method:"+timeElapsed);

        return status;
    }
}
