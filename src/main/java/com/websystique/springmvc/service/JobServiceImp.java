package com.websystique.springmvc.service;

import com.websystique.springmvc.dao.JobDao;
import com.websystique.springmvc.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("jobService")
@Transactional
public class JobServiceImp implements JobService{
	@Autowired
	private JobDao jobDao;

	@Override
	public Job findById(int id) {
		return jobDao.findById(id);
	}

	@Override
	public void addJob(Job job) {
		jobDao.addJob(job);
	}

	@Override
	public void deleteJobById(Integer id) {
		jobDao.deleteJobById(id);
	}

	@Override
	public List<Job> findAllJobs() {
		return jobDao.findAllJobs();
	}

	@Override
	public Job findJobByName(String nameOfCompany) {
		return jobDao.findJobByName(nameOfCompany);
	}

	@Override
	public void updateJob(Job job) {
		Job entity = jobDao.findById(job.getId());
		if(entity!=null){
			entity.setNameOfCompany(job.getNameOfCompany());
			entity.setAdresssOfCompany(job.getAdressOfCompany());

		}

	}
}
