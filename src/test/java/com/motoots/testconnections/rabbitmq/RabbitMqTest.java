package com.motoots.testconnections.rabbitmq;

import com.motoots.testconnections.rabbitmq.listener.MessageListener;
import com.motoots.testconnections.rabbitmq.sender.MessageSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.concurrent.TimeUnit;

@ActiveProfiles("rabbitmq")
@SpringBootTest(classes = {RabbitMqConfig.class})
public class RabbitMqTest {

    @Autowired
    MessageSender messageSender;

    @Autowired
    MessageListener messageListener;

    @Test
    void send() throws InterruptedException {
        messageSender.send("It's-a me, Mario!");
        messageListener.getLatch().await(1000, TimeUnit.MILLISECONDS);
    }
}
