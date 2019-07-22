package com.mayuri;
import org.apache.activemq.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageConsumer {
	
	
	@JmsListener(destination = "jms/TPActiveMQQueue")
	public void receiveMessage(final Message jsonMessage) {
		System.out.println("Received message " + jsonMessage);
		
	
	}

}