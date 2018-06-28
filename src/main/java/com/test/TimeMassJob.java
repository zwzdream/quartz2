package com.test;


import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * 功能:定时群发工作任务
 * @author WH1707008
 */
public class TimeMassJob implements org.quartz.Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(new Date());
    }
}
