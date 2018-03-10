package com.javacodegeeks.examples.jaxws.client;

import java.util.concurrent.Future;

public class MessageClient {

	public static void main(String[] args) throws InterruptedException {
		
		ChangeMessage_Service service = new ChangeMessage_Service();
		ChangeMessage port = service.getChangeMessageImplPort();
		
		OurAsyncHandler handler = new OurAsyncHandler();
		
		Future<?> response = port.changeMessageAsync("Java Code Geeks rock!", handler);
		while(!response.isDone()) {
			Thread.sleep(100);
		}

		String message = handler.getResponse();
		System.out.println("Service responded through callback with: " + message);

		System.exit(0);

	}

}
