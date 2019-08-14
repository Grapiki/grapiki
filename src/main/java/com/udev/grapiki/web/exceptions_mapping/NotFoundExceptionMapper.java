package com.udev.grapiki.web.exceptions_mapping;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.udev.grapiki.model.exceptions.NotFoundException;


@Provider
public class NotFoundExceptionMapper  implements ExceptionMapper<NotFoundException>{
	@Override
	  public Response toResponse(NotFoundException exception) {
	    return Response.status(Status.NOT_FOUND)
	                   .type(MediaType.TEXT_PLAIN)
	                   .entity(exception.getMessage())
	                   .build();
	  }
}
