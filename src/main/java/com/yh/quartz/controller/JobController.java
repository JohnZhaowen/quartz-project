package com.yh.quartz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yh.quartz.service.JobService;

@RestController
public class JobController {
	@Autowired
    private JobService jobService;

    /**
     * 创建cron任务
     */
    @RequestMapping(value = "/cron")
    public String startCronJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup){
        jobService.addCronJob(jobName,jobGroup);
        return "create cron task success";
    }

    /**
     * 创建异步任务
     */
    @RequestMapping(value = "/async")
    public String startAsyncJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup){
        jobService.addAsyncJob(jobName,jobGroup);
        return "create async task success";
    }

    /**
     * 暂停任务
     */
    @RequestMapping(value = "/pause")
    public String pauseJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup){
        jobService.pauseJob(jobName,jobGroup);
        return "pause job success";
    }

    /**
          * 恢复任务
     */
    @RequestMapping(value = "/resume")
    public String resumeJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup){
        jobService.resumeJob(jobName,jobGroup);
        return "resume job success";
    }

    /**
          * 删除务
     */
    @RequestMapping(value = "/delete",method = RequestMethod.PUT)
    public String deleteJob(@RequestParam("jobName") String jobName, @RequestParam("jobGroup") String jobGroup){
        jobService.deleteJob(jobName,jobGroup);
        return "delete job success";
    }
}
