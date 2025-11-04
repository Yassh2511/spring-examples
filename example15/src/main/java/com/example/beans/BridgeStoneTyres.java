package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres
{
    public void rotate()
    {
        System.out.println("BridgeStone tyres rotating");
    }
}
