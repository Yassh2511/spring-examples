package com.example.main;

public class TyreFactory {

    Tyre getTyre(String tyre)
    {
        if(tyre.equals("MRF"))return new MrfTyres();

        if(tyre.equals("Appolo"))return new AppoloTyres();

        return null;

    }
}
