package com.motoots.testconnections.redis;

import com.motoots.testconnections.redis.Service.GreetingService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("redis")
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, MongoAutoConfiguration.class})
@EnableCaching
public class RedisConfig {

    @Bean
    GreetingService greetingService() {
        return new GreetingService();
    }
}
