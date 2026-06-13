package com.example.E_commerce.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// The work or @Controller annotation is used to mark a class as a Spring
@Controller
public class HomeController {
     // The work or @GetMapping annotation is used to map HTTP GET requests to a specific method.
      
     @GetMapping("/")
        public String home() {
            return "index";           //retuns index.html file
        }

}
