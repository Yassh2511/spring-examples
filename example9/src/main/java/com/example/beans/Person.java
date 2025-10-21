package com.example.beans;

public class Person {

    private String name;
    private Vehicle vehicle;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public Vehicle getVehicle()
    {
        return this.vehicle;
    }
    public void setVehicle(Vehicle v)
    {
        this.vehicle=v;
    }
}
