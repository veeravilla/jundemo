package com.test.cxf;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bank.test.CreditRequest;
import com.bank.test.CreditResponse;

@Path("/bank")
public interface CreditReportService {
	
	@POST
	@Path("/creditreport")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public CreditResponse getCreditReport(CreditRequest request);

}
