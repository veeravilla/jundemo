package com.test.cxf;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bank.test.CreditRequest;
import com.bank.test.CreditResponse;


@Path("/public")
public interface StudentService {
	
	@GET
	@Path("/student/{sno}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public StudentDTO getStudent(@PathParam("sno") int sno) throws Exception;
	
	@POST
	@Path("/student")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public StudentDTO saveStudent(StudentDTO studentDTO) throws Exception;
	
	/*@POST
	@Path("/creditreport")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public CreditResponse getCreditReport(CreditRequest request);*/

}
