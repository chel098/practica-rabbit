package com.example.producer.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {
    public static final String queue = "queue";
    public static final Logger logger = LoggerFactory.getLogger(RabbitMQConsumer.class);
    @RabbitListener(queues = queue)
    public void consume(String message) {
        logger.info("Message received: " + message);

    }
}
