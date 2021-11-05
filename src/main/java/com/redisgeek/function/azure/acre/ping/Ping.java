package com.redisgeek.function.azure.acre.ping;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

@Component
public class Ping implements Function<Optional<String>, String> {

    private final RedisConnectionFactory redisConnectionFactory;

    public Ping(RedisConnectionFactory redisConnectionFactory) {
        this.redisConnectionFactory = redisConnectionFactory;
    }

    public String apply(Optional<String> request) {
        return Objects.requireNonNull(
                Objects.requireNonNull(
                        redisConnectionFactory)
                        .getConnection()
                        .ping()
        );
    }
}