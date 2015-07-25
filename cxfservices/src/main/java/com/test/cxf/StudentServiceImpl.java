package com.test.cxf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bank.test.Address;
import com.bank.test.CreditRequest;
import com.bank.test.CreditResponse;
import com.bank.test.Status;

@Service(value="studentService")
//@Qualifier("studentService")
public class StudentServiceImpl implements StudentService {

	public StudentDTO getStudent(int sno) throws Exception {
		// TODO Auto-generated method stub
		return new StudentDTO(100, "Tim", "Ms", 4500);
	}

	public StudentDTO saveStudent(StudentDTO studentDTO) throws Exception {
		//TODO: JDBC
		return studentDTO;
	}
	
	/*public CreditResponse getCreditReport(CreditRequest request) {
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
	}*/

}
