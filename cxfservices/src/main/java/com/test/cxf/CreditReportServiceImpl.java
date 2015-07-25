package com.test.cxf;

import com.bank.test.Address;
import com.bank.test.CreditRequest;
import com.bank.test.CreditResponse;
import com.bank.test.Status;

//@Service(value="creditService")
public class CreditReportServiceImpl  implements CreditReportService,ICreditReportService{

	public CreditResponse getCreditReport(CreditRequest request) {
		System.out.println(" Request  " + request);
		//Validation Rules
		//TODO: JDBC
		CreditResponse response = new CreditResponse();
		response.setCreditScore(789);
		response.setNoOfAccounts(2);
		Status status = new Status("100","SUCCESS");
		response.setStatus(status);
		response.setZipcode("55447");
		response.getAddress().add(new Address("Plymouth", "MN"));
		response.getAddress().add(new Address("Test55", "NJ"));
		return response;
	}

}
