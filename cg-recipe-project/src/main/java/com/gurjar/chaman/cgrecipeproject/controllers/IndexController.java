package com.gurjar.chaman.cgrecipeproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 18-Aug-2020
 */

@RestController
public class IndexController {

    @GetMapping(value = {"", "/", "/ping"})
    private String ping() {
        return "Current Date : " + new Date();
    }

}
