package org.example.springintro.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {



    //uc1
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz! ! !";

    }
// UC2
    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello " + name+" from Bridgelabcz";
    }
}