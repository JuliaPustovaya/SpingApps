package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Job;

public interface JobDao {
	Job findById(int id);

	void addJob(Job job);

	void deleteJobById(Integer id);

	List<Job> findAllJobs();

	Job findJobByName(String nameOfCompany);
}
