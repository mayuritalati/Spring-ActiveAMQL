
package com.mayuri;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ActiveMQJmsMessageListenerTest {
    @Autowired
    private AtomicInteger count = null;    
    @Test
    public void testMessage() throws Exception {
    	System.out.println("test:"+count.get());
        assertEquals(10, count.get());
    }    
}
