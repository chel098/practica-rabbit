package com.example.consumer.rabbitmw;

import com.example.consumer.dto.MessageDto;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(MessageDto message) {
        rabbitTemplate.convertAndSend(RabbitMqConfig.exchange, RabbitMqConfig.routingKey, message);
    }
}
