package com.labs.quartzlab.config;

import com.labs.quartzlab.SimpleJob;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CronScheduler {

    @Bean
    public JobDetail cronJobDetail() {
        return JobBuilder.newJob(SimpleJob.class)
                .withIdentity("CronJob")
                .usingJobData("key", "quartz test1")
                .usingJobData("name", "quartz name")
                .storeDurably()
                .build();

    }

    @Bean
    public Trigger cronTrigger(JobDetail cronJobDetail) {
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/10 * * * * ?");
        return TriggerBuilder.newTrigger()
                .withIdentity("CronScheduler", "triggerGroup")
                .withSchedule(scheduleBuilder)
                .forJob(cronJobDetail)
                .build();

    }
}
