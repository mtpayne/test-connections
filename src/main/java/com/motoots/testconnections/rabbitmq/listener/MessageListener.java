package com.motoots.testconnections.rabbitmq.listener;

import com.motoots.testconnections.rabbitmq.RabbitMqConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import java.util.concurrent.CountDownLatch;

@Slf4j
public class MessageListener {

    private CountDownLatch latch = new CountDownLatch(1);

    @RabbitListener(queues = RabbitMqConfig.MY_QUEUE)
    public void receive(String message) {
        log.info("Message received: " + message);
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
