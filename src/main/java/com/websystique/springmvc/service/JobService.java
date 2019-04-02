package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.Job;

public interface JobService {
	Job findById(int id);

	void addJob(Job job);

	void deleteJobById(Integer id);

	List<Job> findAllJobs();

	Job findJobByName(String nameOfCompany);

	void updateJob(Job job);
}
