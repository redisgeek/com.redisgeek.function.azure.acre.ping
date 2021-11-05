package com.redisgeek.function.azure.acre.ping;

import com.microsoft.azure.functions.ExecutionContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import java.util.Optional;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = com.redisgeek.function.azure.acre.ping.PingHandler.class)
public class PingHandlerTest extends AbstractIntegrationTest {

    @Test
    public void start() {
        FunctionInvoker<Optional<String>, String> handler = new FunctionInvoker<>(PingHandler.class);
        String result = handler.handleRequest(Optional.empty(), new ExecutionContext() {
            @Override
            public Logger getLogger() {
                return Logger.getLogger(this.getClass().getName());
            }

            @Override
            public String getInvocationId() {
                return "id1";
            }

            @Override
            public String getFunctionName() {
                return PingHandler.Constants.F_NAME;
            }
        });
        handler.close();
        assertThat(result).isEqualTo("PONG");
    }

}
