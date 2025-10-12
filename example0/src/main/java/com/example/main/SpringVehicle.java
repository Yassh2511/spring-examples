package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
public class SpringVehicle {

    @Autowired
    private Speakers speakers;

    @Autowired

    private Tyres tyres;

    public void makeVehicle1()
    {
        speakers.makeSound();
        tyres.rotate();
    }
}

//in this way spring achieve the losse coupling between componets of class
// so here even if any new speaker is change it will be created outside this not in the core logic
// This is inversion control which is acieve by spring