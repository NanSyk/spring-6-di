package com.spring6.dependencyInjection.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("In the Controller now");
        return "Hello World!!!!";
    }
}
