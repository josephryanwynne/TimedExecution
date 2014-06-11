package joewynne.examples.timedexecution;

import org.junit.Test;

/**
 * Stupid class which just sleeps for some period of time. Just for testing. :)
 */
public class TimedExecution 
{

    @Test
    public void waitFor() throws InterruptedException{
        //Time in seconds
        long waitTimeSeconds = Long.getLong("waitTime", 45);
        
        long waitTimeMillis = waitTimeSeconds * 1000;
        
        System.out.println("Sleeping for " + waitTimeSeconds + " seconds");
        Thread.sleep(waitTimeMillis);
        
    }
    
}
