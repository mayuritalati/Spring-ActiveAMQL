package com.mayuri;



import javax.jms.JMSException;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
@Component
public class ActiveMQMessageProducer {

   
    @SendTo("jms/TPActiveMQQueue")
	public String SendMessages() throws JMSException {
		
		String response = null;
		for (int i = 0; i < 20; i++) {
			
			response  = "Hello " + i;
			System.out.println(response);
		}
		return response;
	}
}
