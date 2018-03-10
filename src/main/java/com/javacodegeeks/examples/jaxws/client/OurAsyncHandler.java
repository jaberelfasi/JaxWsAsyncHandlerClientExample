package com.javacodegeeks.examples.jaxws.client;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class OurAsyncHandler implements AsyncHandler<TestMessage> {
	
	private TestMessage tMessage;

	@Override
	public void handleResponse(Response<TestMessage> response) {
		
		try {
			tMessage = response.get();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public String getResponse() {
		return tMessage.getMessage();
	}
}
