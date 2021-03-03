package com.motoots.testconnections.rabbitmq;

import com.motoots.testconnections.rabbitmq.listener.MessageListener;
import com.motoots.testconnections.rabbitmq.sender.MessageSender;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("rabbitmq")
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, MongoAutoConfiguration.class})
public class RabbitMqConfig {

    public static final String MY_QUEUE = "my-queue";

    @Bean
    public Queue queue() {
        return new Queue(RabbitMqConfig.MY_QUEUE);
    }

    @Bean
    public MessageSender sender() {
        return new MessageSender();
    }

    @Bean
    public MessageListener listener() {
        return new MessageListener();
    }
}
