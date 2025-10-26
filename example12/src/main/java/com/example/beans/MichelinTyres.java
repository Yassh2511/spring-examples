package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres
{
    public void rotate()
    {
        System.out.println("Michelin tyres rotating");
    }
}
