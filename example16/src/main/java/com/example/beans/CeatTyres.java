package com.example.beans;

import com.example.Interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class CeatTyres implements Tyres
{
    public String rotate()
    {
        return "Ceat Tyres are rotating";
    }

    public String stop()
    {
        return "Car stopeed using ceat tyres";
    }
}
