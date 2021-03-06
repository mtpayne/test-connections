package com.motoots.testconnections.mysql;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("mysql")
@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class MySqlConfig {
}
