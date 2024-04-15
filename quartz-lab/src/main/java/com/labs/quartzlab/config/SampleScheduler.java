package com.labs.quartzlab.config;

import com.labs.quartzlab.SimpleJob;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleScheduler {

    @Bean
    public JobDetail sampleJobDetail() {
        return JobBuilder.newJob(SimpleJob.class)
                .withIdentity("sampleJob")
                .usingJobData("key", "quartz test1")
                .usingJobData("name", "quartz name")
                .storeDurably()
                .build();

    }

    @Bean
    public Trigger sampleTrigger(JobDetail sampleJobDetail) {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(2)
                .repeatForever();
        return TriggerBuilder.newTrigger()
                .withIdentity("sampleTrigger", "triggerGroup")
                .withSchedule(scheduleBuilder)
                .forJob(sampleJobDetail)
                .build();

    }
}
