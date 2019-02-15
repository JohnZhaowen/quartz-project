package com.yh.quartz.service;

public interface JobService {
    /**
	  * 添加一个定时任务
     */
    void addCronJob(String jobName, String jobGroup);

    /**
          * 添加异步任务
     */
    void addAsyncJob(String jobName, String jobGroup);

    /**
          * 暂停任务
     */
    void pauseJob(String jobName, String jobGroup);

    /**
          * 恢复任务
     */
    void resumeJob(String triggerName, String triggerGroup);

    /**
          * 删除job
     */
    void deleteJob(String jobName, String jobGroup);
}
