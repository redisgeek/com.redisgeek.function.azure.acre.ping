package com.redisgeek.function.azure.acre.ping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PingTest extends AbstractIntegrationTest {

    @Autowired
    private Ping ping;

    @Test
    public void test() {
        String result = ping.apply(Optional.empty());
        assertThat(result).isEqualTo("PONG");
    }

}


//IVL workloads
//Dev 200GB (already running)
//QA 200
//UAT 200 GB in 2 regions
//Prod 200GB in 2 regions

//Using E100 @ Capacity 4
//Using RediSearch so can't use Flash

//US EAST-2 & US Central is DR
//8 x E10 in the same subscription