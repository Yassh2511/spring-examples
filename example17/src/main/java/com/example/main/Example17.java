/* this example is same like example 16 only difference in this is that we have used
    AOP inside this
 */
package com.example.main;

import com.example.beans.VehicleServices;
import com.example.config.ProjectConfig;
import com.example.model.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example17
{
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Song song=new Song();
        song.setTitle("Blank space");
        song.setSingerName("Taylor swift");

        var vehicleServices=context.getBean(VehicleServices.class);
        boolean vehicleStarted=true;

        String playingMusic=vehicleServices.playSong(vehicleStarted,song);
        String moveVehicle=vehicleServices.moveVehicle(vehicleStarted);
        String stopVehicle=vehicleServices.stopVehicle(vehicleStarted);

    }
}
