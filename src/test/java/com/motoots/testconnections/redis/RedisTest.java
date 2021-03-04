package com.motoots.testconnections.redis;

import com.motoots.testconnections.redis.Service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("redis")
@Slf4j
@SpringBootTest(classes = {RedisConfig.class})
public class RedisTest {

    @Autowired
    GreetingService greetingService;

    @Test
    void getGreeting() {
        log.info("About to evict cache");
        greetingService.evictGreetingCache();

        log.info("About to get greeting for first time");
        String greetingNotFromCache = greetingService.getGreeting();
        log.info("Got greeting {}", greetingNotFromCache);

        log.info("About to get greeting for second time");
        String greetingFromCache = greetingService.getGreeting();
        log.info("Got greeting {}", greetingFromCache);

        assertEquals(greetingNotFromCache, greetingFromCache);
    }
}
