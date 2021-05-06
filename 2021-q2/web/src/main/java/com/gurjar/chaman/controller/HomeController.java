package com.gurjar.chaman.controller;

/*
@author: Chaman Gurjar    
@version: 1.0. 06-May-2021;
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @Value("${app.version}")
    private String currentVersion;

    @GetMapping(value = {"/","/ping"})
    private String getVersion() {
        return "Current Version: " + currentVersion + ".   Current Date: " + new Date();
    }

}
