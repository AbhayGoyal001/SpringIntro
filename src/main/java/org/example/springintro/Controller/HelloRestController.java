package org.example.springintro.Controller;

import org.example.springintro.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // UC1 - GetMethod: Handles GET requests at "/", "/home", or an empty path.
// URL: http://localhost:8080/  OR  http://localhost:8080/home
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From Abhay this is my first spring boot application! ! !";
    }

    // UC2 - Query Parameters: Handles GET requests at "/query" with a 'name' parameter.
// URL: http://localhost:8080/hello/query?name=Abhay
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " Thanks for using my application";
    }

    // UC3 - Path Parameters: Handles GET requests at "/{name}" using a path variable.
// URL: http://localhost:8080/hello/Abhay
    @GetMapping("/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " Thanks for using my application";
    }

    // UC4 - PostMethod: Handles POST requests at "/post" with a User object in the request body.
// URL: Use POST request at http://localhost:8080/hello/post with JSON body: { "firstName": "Abhay", "lastName": "Goyal" }
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " Thanks for using my application";
    }
    // UC5 - PutMethod: Handles PUT requests at "/put" with a User object in the request body.
// URL: Use PUT request at http://localhost:8080/put with JSON body: { "firstName": "Abhay", "lastName": "Goyal" }
    @PutMapping("/put")
    public String sayHelloPut(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " Thanks for using my application";
    }


}