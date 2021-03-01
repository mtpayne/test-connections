package com.motoots.testconnections.mongodb;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("mongodb")
@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MongoDbConfig {
}
