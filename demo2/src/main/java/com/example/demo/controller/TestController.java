package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class TestController {
    private static final Logger LOG = Logger.getLogger(TestController.class.getName());
    @GetMapping("/")
    public String hello() {
        LOG.log(Level.INFO, "Index API is calling");
        return "Hello";
    }
}
