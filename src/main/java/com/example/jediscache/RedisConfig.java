package com.example.jediscache;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

@Component
public class RedisConfig {

    @Bean
    public JedisPool createJedisPool(){
        String host = "127.0.0.1";
        int port = 6379;

        return new JedisPool(host,port);
    }
}
