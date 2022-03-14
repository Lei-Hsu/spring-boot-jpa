package com.example.demo2.utils.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    String exchange = "amq.direct"; // 設定 exchange name
    String routingKey = "testQueue" ; // 設定 route key , 記得要去 exchange 那邊 bind

    public void sendTestMessages(String msg){
        this.rabbitTemplate.convertAndSend(exchange ,routingKey , msg);
    }
}
