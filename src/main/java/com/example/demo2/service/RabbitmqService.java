package com.example.demo2.service;

import com.example.demo2.dto.request.RabbitmqRequest;

public interface RabbitmqService {
    void message(RabbitmqRequest rabbitmqRequest);

}
