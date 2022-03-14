package com.example.demo2.utils.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "testQueue") // 選擇要 consume 哪個 queue
public class RabbitmqReceiver {

    @RabbitHandler
    public void getRabbitMessage(String message){
        System.out.println(message);
    };
}
