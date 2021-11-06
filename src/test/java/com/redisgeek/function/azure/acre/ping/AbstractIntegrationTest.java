package com.redisgeek.function.azure.acre.ping;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public abstract class AbstractIntegrationTest {

    static {
        GenericContainer<?> redis = new GenericContainer<>("redis:6-alpine")
                .withExposedPorts(6379);
        redis.start();
        System.setProperty("MAIN_CLASS","com.redisgeek.function.azure.acre.ping.Application");
        System.setProperty("spring.redis.host", redis.getContainerIpAddress());
        System.setProperty("spring.redis.port", redis.getFirstMappedPort() + "");
        System.setProperty("spring.redis.ssl", "false");
    }
}
