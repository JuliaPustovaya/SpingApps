package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.Job;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("jobDao")
public class JobDaoImpl extends AbstractDao<Integer, Job> implements JobDao {
    @Override
    public Job findById(int id) {
        return getByKey(id);
    }

    @Override
    public void addJob(Job job) {
        persist(job);
    }

    @Override
    public void deleteJobById(Integer id) {
        org.hibernate.Query query = getSession().createSQLQuery("delete from Job where id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public List<Job> findAllJobs() {
        Criteria criteria = createEntityCriteria();
        return (List<Job>) criteria.list();

    }

    @Override
    public Job findJobByName(String nameOfCompany) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("nameOfCompany", nameOfCompany));
        return (Job) criteria.uniqueResult();
    }
}
