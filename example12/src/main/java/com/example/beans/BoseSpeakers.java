package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers
{
    public void makeSound()
    {
        System.out.println("Bose speakers making sound");
    }
}
