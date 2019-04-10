package com.websystique.springmvc.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springmvc.exception.ExceptionApp;
import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.service.EmployeeService;
import com.websystique.springmvc.service.JobService;

@RestController
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
public class AppControllerJSON {

	private EmployeeService service;
	private JobService jobService;
	private MessageSource messageSource;

	@Inject
	public AppControllerJSON(EmployeeService service, JobService jobService, MessageSource messageSource) {
		this.service = service;
		this.jobService = jobService;
		this.messageSource = messageSource;
	}

	@GET
	@Path("/{list}")
	//@Secured({" "}) тут надо будет указать кому доступен будет запрос
	public List listEmployees() throws ExceptionApp {
		List<Employee> employees = service.findAllEmployees();
		return employees;
	}

	@GET
	@Path("/new")
	public Employee newEmployee(@Valid Employee e) throws ExceptionApp {
		Employee employee = new Employee();
		employee.setName(e.getName());
		employee.setSsn(e.getSsn());
		employee.setJoiningDate(e.getJoiningDate());
		employee.setSalary(e.getSalary());
		return employee;
	}
}
