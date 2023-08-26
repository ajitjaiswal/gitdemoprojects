package com.ajit.demogitactions.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class GitRestController {

    @GetMapping
    public String sayHello() {

        return "Hello Git Actions!";

    }



}
