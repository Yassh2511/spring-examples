package com.example.main;

public class Vehicle
{
    public void makeVehicle1()
    {
        SonySpeakers sonySpeakers=new SonySpeakers();
        System.out.println(sonySpeakers.makeSound());

        CeatTyers ceatTyres=new CeatTyers();
        System.out.println(ceatTyres.rotate());

    }

    // This Vehicle and its two components speakers and tyres
    // This are --tightly coupled-- that means if we want to change
    // the tyres from ceat to mrf then i have to change all the code present in the
    // main core logic


    //By using inversion control and dependency injection we try to reduce the
    // tightly coupling to loosely couple by adapting different methods like
    // factory method

    public void makeVehicle2()
    {
        SpeakerFactory speakerFactory=new SpeakerFactory();
        Speakers speakers=speakerFactory.getSpeaker("Sony");
        System.out.println(speakers.makeSound());

        TyreFactory tyreFactory=new TyreFactory();
        Tyre tyre=tyreFactory.getTyre("MRF");
        System.out.println(tyre.rotate());
    }

    // Now this makeVehicle2 is loosely coupled not truely but still by using factory method
    // we make it possible to change any componets not in the core logic that is we are not creating the core componets in the  core logic
    // Still it have some probelms as we have to write the tyre or speaker name
    // But it is better than the above method
    // Spring make the totaly loosely coupled so that we can chanage any componets and not disturbing the core logic


    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        System.out.println("Vehicle 1:");
        v.makeVehicle1();
        System.out.println("Vehcile 2");
        v.makeVehicle2();
    }
}
