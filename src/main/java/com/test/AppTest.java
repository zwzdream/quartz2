package com.test;

import com.test.quartz.QuartzManager;

public class AppTest{
    public static void main(String[] args) {
        try {
            String job_name = "动态任务调度";
            System.out.println("【系统启动】开始(每1秒输出一次)...");
            QuartzManager.addJob(job_name, job_name, job_name, job_name, TimeMassJob.class, "0/1 * * * * ?", null);
            Thread.sleep(2000);
            System.out.println("【修改时间】开始(每2秒输出一次)...");
            QuartzManager.modifyJobTime(job_name, job_name, job_name, job_name, "10/2 * * * * ?");
            Thread.sleep(6000);
            System.out.println("【移除定时】开始...");
            QuartzManager.removeJob(job_name, job_name, job_name, job_name);
            System.out.println("【移除定时】成功");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}