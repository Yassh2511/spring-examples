package com.example.beans;

import com.example.Interfaces.Speakers;
import com.example.model.Song;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers
{
    public String makeSound(Song song)
    {
        return song.getTitle()+" song is playing of "+song.getSingerName();
    }
}
