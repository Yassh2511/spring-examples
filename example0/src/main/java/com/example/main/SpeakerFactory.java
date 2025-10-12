package com.example.main;

public class SpeakerFactory {
    public Speakers getSpeaker(String speaker) {

        if(speaker.equals("Sony"))return new SonySpeakers();

        if(speaker.equals("Bosch"))return new BoschSpeakers();

        return null;
    }
}
