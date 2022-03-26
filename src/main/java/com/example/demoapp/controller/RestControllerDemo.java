package com.example.demoapp.controller;

import com.example.demoapp.entity.NumberEntity;
import com.example.demoapp.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllerDemo {

    final
    RestService restService;

    @Autowired
    public RestControllerDemo(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("/getApi")
    String getResult(@RequestParam int id){
        return "Hello World " + id;
    }

    @PostMapping("/postApi")
    NumberEntity postResult(@RequestBody NumberEntity numberEntity){
        return restService.add(numberEntity);
    }
}
