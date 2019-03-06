package com.project.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.rest.domain.MyDataObject;

@RestController
public class Contoller {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "mu";
	}

	@RequestMapping(value = "/rates", //
			method = RequestMethod.GET, //
			produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<MyDataObject> getEmployees() {
		List<MyDataObject> list = new ArrayList<>();
		list.add(new MyDataObject("jhjh", "hjhjh"));
		return list;
	}
}