package com.test.cxf;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.Provider;

import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

@Provider
public class CustomRequestInterceptor  implements RequestHandler{

	public Response handleRequest(Message message, ClassResourceInfo resource) {
		
		//Read Header Data
		Map<String, List<String>> headers = CastUtils.cast((Map)message.get(Message.PROTOCOL_HEADERS));
		
		System.out.println("HEaders ############# " + headers );
		
		 
		String queryString = (String)message.get(Message.QUERY_STRING);
		System.out.println("queryString" + queryString );
		
		return validateRequest(headers);//rb.build(); / /FWD request to actual service.
	}
	
	public Response validateRequest(Map<String, List<String>> headers){
		try{
			//get userid
			String userID = headers.get("userid").get(0);
			String password = headers.get("password").get(0);
			if(userID != null && userID.equals("jhon") && password != null && password.equals("test1234")){
				return null; //login success
			}else{
				return buildErrorMessage("Login Failed!!!", "Please Validate UserName & Password");
			}
		}catch(Exception ex){
			return buildErrorMessage("Login Failed!!!", "UserName & Password are misising in the Http Header");
		}
		
	}
	
	public Response buildErrorMessage(String stausCode,String msg){
		ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
		ServiceError serviceError = new ServiceError(stausCode, msg);
		rb.entity(serviceError);
		
		return rb.build();
	}

}
