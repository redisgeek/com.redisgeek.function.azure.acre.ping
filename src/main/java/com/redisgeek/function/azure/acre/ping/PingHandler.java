package com.redisgeek.function.azure.acre.ping;


import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.TimerTrigger;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import java.util.Optional;

public class PingHandler extends FunctionInvoker<Optional<String>, String> {

    @FunctionName(Constants.F_NAME)
    public void run(
            @TimerTrigger(name = Constants.T_NAME, schedule = Constants.CRON) String timerInfo,
            final ExecutionContext context) {
        handleRequest(Optional.empty(), context);
    }

    public static class Constants {
        public static final String F_NAME = "acre-ping-function";
        public static final String T_NAME = "pingTimerTrigger";
        public static final String CRON = "*/5 * * * * *";
    }
}