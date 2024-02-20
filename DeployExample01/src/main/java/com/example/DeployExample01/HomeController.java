package com.example.DeployExample01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${myCustomVarTree.devName}")
    String name;


    @GetMapping
    public String greeting(){
        return "Hello "+ name;
    }
}
