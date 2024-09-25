package com.dheeraj.Spring.Boot.tutorial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
   // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String helloworld(){
      return "Welcome to Spring Boot dheeraj r gowda!!";
    }
}
