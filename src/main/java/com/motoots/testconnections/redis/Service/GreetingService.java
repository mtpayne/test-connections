package com.motoots.testconnections.redis.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

@Slf4j
public class GreetingService {

    @Cacheable(cacheNames = "my-cache")
    public String getGreeting(){
        String greeting = "Say what?";
        log.info("Returning greeting: {} NOT from cache", greeting);

        return greeting;
    }

    @CacheEvict(value = "my-cache")
    public void evictGreetingCache(){
        log.info("Evicting cache");
    }
}
