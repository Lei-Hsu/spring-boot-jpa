package com.example.demo2.service.Impl;

import com.example.demo2.dto.request.RabbitmqRequest;
import com.example.demo2.service.RabbitmqService;
import com.example.demo2.utils.rabbitmq.RabbitmqSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqServiceImpl implements RabbitmqService {

    @Autowired
    private RabbitmqSender rabbitmqSender;

    @Override
    public void message(RabbitmqRequest rabbitmqRequest) {
        var message = rabbitmqRequest.getMessage();
        rabbitmqSender.sendTestMessages(message);
    }
}
