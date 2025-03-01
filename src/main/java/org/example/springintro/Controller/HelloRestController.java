package org.example.springintro.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {


    // curl localhost:8080/hello -w "\n"
    //uc1
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello Abhay this is my first spring boot application";

    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello " + name+" Thanks for using my application";
    }
}