package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontroller {


    @RequestMapping(value="api")
    public String getString(){
        return "hollo";
    }


}
