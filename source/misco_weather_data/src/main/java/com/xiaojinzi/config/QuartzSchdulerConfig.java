package com.xiaojinzi.config;

import com.xiaojinzi.job.QuartzSchdulerJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description 配置刷新方式
 */
@Configuration
public class QuartzSchdulerConfig {

    private final static Integer TIME_OUT = 1800;

    @Bean
    public JobDetail weatherDataJobDetail(){
        return JobBuilder.newJob(QuartzSchdulerJob.class)
                .withIdentity("weatherDataJobDetail").storeDurably().build();
    }

    @Bean
    public Trigger weatherDataTrigger(){
        /**
         * 刷新方式
         */
        SimpleScheduleBuilder simpleScheduleBuilder =
                SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(TIME_OUT).repeatForever();

        /**
         * 刷新任务
         */
        return TriggerBuilder.newTrigger().forJob(weatherDataJobDetail()).withIdentity("weatherDataTrigger")
                .withSchedule(simpleScheduleBuilder).build();
    }
}
