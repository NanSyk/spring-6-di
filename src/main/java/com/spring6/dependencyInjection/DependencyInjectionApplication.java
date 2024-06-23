package com.spring6.dependencyInjection;

import com.spring6.dependencyInjection.Controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In the main ");
        System.out.println(controller.sayHello());
    }


}
