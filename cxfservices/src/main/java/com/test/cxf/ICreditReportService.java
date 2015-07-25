package com.test.cxf;

import javax.jws.WebService;

import com.bank.test.CreditRequest;
import com.bank.test.CreditResponse;

@WebService
public interface ICreditReportService {
	
	public CreditResponse getCreditReport(CreditRequest request);

}
