package com.example.demo2.controllers;

import com.example.demo2.dto.request.RabbitmqRequest;
import com.example.demo2.service.RabbitmqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitmqController {

    @Autowired
    RabbitmqService rabbitmqService;


    @PostMapping("/message")
    public String testRabbitmq(@RequestBody RabbitmqRequest rabbitmqRequest){
        rabbitmqService.message(rabbitmqRequest);
        return "Rabbitmq send success";
    };
}
