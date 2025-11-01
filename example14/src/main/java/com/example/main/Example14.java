// This example is about lazy loading how lazy loading can be done
// It gives idea about how a Bean can be created only after we need that
package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example14
{
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before  using person object");
        Person person=context.getBean(Person.class);
        System.out.println("After using person object");

        // Here if we dont use Lazy loading then first person bean created will be print because
        // at first when context is assign then only it create all beans that are present
        // But if we use @Lazy then it will create bean for that class only after we are trying to access that or use that

    }
}
