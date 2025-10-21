package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Vehicle
{
    private String name;

    @PostConstruct
    public void init()
    {
        System.out.println("Enter vehicle name:");
        Scanner sc=new Scanner(System.in);
        String v=sc.next();
        this.name=v;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String toString()
    {
        return this.name;
    }

}
