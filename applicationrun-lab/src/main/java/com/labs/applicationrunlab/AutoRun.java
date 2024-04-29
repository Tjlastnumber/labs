package com.labs.applicationrunlab;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class AutoRun implements ApplicationRunner, Ordered {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= auto run -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    @Override
    public int getOrder() {
        return Integer.MAX_VALUE;
    }

    /**
     * 实验 Scheduled 定时任务
     */
    @Scheduled(cron = "0/10 * * * * ?")
    public void cron() {
        long l = System.currentTimeMillis();
        System.out.println("cron: 0/10 * * * * ?; " + l);
    }
}
