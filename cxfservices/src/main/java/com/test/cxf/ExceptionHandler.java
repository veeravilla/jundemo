package com.test.cxf;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bank.test.Status;

@Provider
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ExceptionHandler implements ExceptionMapper<Exception> {
	public Response toResponse(Exception exception) {
		/*if(exception instanceof SQLException){
			
		}*/
		
		ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
		ServiceError serviceError = new ServiceError("Error", "Something went wrong while processing your request.. Try Again/Conatct Admin");
		rb.entity(serviceError);
		return rb.build();
	}
}