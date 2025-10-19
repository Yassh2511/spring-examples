package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// this will let IOC container to analyzer all the information in the class
/* Spring @Configuration annotation is part of the spring core framework
    Spring configuration annotation indicates that the class has @Bean definition
    methods So spring container can process the class and generate spring beans to be used in the
    application
 */
@Configuration
public class ProjectConfig
{
    /* @Bean annotation,which lets spring know that ii needs to call
    this method when it initializes its context and adds the returned value to the context

     */

    @Bean
    Vehicle vehicle()    {
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    /*

    the method usually follow verbs notation.But for methods
    which we will to create beans can use nouns as name
    This wil be a good practise as the method name will become
    bean names as well in the context
     */


    @Bean
    String hello()
    {
        return "Hello world";
    }

    @Bean
    Integer number()
    {
        return 16;
    }
}
