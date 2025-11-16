package com.example.aspects;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;

@Aspect
@Component
@Order(1)
public class VehicleStartCheckAspect
{
    @Before("execution(* com.example.beans.VehicleServices.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinpoint,boolean vehicleStarted) throws Throwable
    {
        if(!vehicleStarted)
        {
            throw new RuntimeException("Vehicle not started yet");
        }
    }
}
