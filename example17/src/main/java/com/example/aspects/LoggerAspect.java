package com.example.aspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect
{
    private Logger logger=Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.example.services.*.*(..))");
}
