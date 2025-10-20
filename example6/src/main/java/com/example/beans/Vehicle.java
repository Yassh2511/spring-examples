package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    @PostConstruct
    public void initialize()
    {
        this.name="honda";
    }

    @PreDestroy
    public void Destroy()
    {
        System.out.println("context.close lead to execute this method and all beans and context will be erased");

    }

}
