package com.labs.quartzlab;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SimpleJob extends QuartzJobBean {

    private static Logger logger = LoggerFactory.getLogger(SimpleJob.class);

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private String key;

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        String name = context.getTrigger().getKey().getName();
        String group = context.getTrigger().getKey().getGroup();
        logger.info("name: {}, group: {}, des: {}", name, group, context.getTrigger().getDescription());
    }
}
