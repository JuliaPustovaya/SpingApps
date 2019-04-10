package com.websystique.springmvc.exception.mapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.websystique.springmvc.exception.ExceptionApp;

@Provider
public class ExceptionAppMapper implements ExceptionMapper<ExceptionApp> {
	@Override
	public Response toResponse(ExceptionApp e) {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
				.type(MediaType.APPLICATION_JSON_TYPE)
				.entity(e)
				.build();
	}
}
