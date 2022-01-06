package com.ms.gcp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/get")
    public String getResponse(){
        return "I'm gradle springboot project running on GKE";
    }
}
