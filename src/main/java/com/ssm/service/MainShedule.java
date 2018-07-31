/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.service;

import org.quartz.*;
import org.quartz.impl.JobDetailImpl;

import static org.quartz.DateBuilder.futureDate;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerKey.triggerKey;

/**
 * @author baitao
 * @date 2018/7/31 17:54
 */
public class MainShedule {
	private static Scheduler scheduler;

	public static void run(String[] args) throws SchedulerException {
		JobDetail job = JobBuilder.newJob(TestQuartzJob.class)
				.withIdentity("myJob")
				.build();

		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity(triggerKey("myTrigger", "myTriggerGroup"))
				.withSchedule(simpleSchedule()
						.withIntervalInHours(1)
						.repeatForever())
				.startAt(futureDate(10, DateBuilder.IntervalUnit.MINUTE))
				.build();

		scheduler.scheduleJob(job, trigger);
		scheduler.start();
	}

	public static void stop() throws SchedulerException {
		scheduler.shutdown();

	}
}
