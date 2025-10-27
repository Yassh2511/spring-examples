package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/*
@Scope annotation with scop_singleton make sure that to create only one bean
throught the application and maintain only that bean that is there will be only
one bean in spring context even if referred 100 time or used 100 times
 */
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Vehicle
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    @PostConstruct
    public void initialize()
    {
        this.name="honda";
    }

    @PreDestroy
    public void Destroy()
    {
        System.out.println("context.close lead to execute this method and all beans and context will be erased");

    }

}
