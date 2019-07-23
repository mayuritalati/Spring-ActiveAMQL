package com.mayuri;
import java.util.concurrent.atomic.AtomicInteger;
import javax.jms.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageListener implements MessageListener 
{ 
    @Autowired
    private AtomicInteger count = null;
    public void onMessage(Message message)
    {
        try 
        {   
            if (message instanceof TextMessage) 
            {
                TextMessage txtMsg = (TextMessage)message;
                System.out.println("Received message from Destination : " +
                                                      txtMsg.getText());				
                System.out.println(count.getAndIncrement());
            }
        } 
        catch (JMSException e) { }
    }

}