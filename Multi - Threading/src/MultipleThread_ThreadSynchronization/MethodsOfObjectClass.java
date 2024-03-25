package MultipleThread_ThreadSynchronization;

/*
 * wait(): : This method used to make the particular Thread wait until it gets a notification.
 * notify(): This method used to send the notification to one of the waiting thread so that
 *  thread enter into running state and execute the remaining task.
 * notifyAll(): This method used to send the notification to all
 *  the waiting threads so that all thread enter into running state and execute simultaneously
 *  
 *  We must call wait(), notify(), notifyAll() methods in side the synchronized blocks or synchronized methods
 *  otherwise it will throw a runtime exception called IllegalMonitorStateException.
 */
public class MethodsOfObjectClass extends Thread{

	int total;
	public void run() {
		for(int i=1;i<=1000;i++) {
			total=total+i;
			if(total>10000) {
				synchronized(this){
					notify();
				}
			}
			try{
				Thread.sleep(5);	
			}catch (InterruptedException e) {	
			}
		}
		System.out.println("user thread total"+total);
	}
	public static void main(String args[]) {
		MethodsOfObjectClass mc=new MethodsOfObjectClass();
		Thread t=new Thread();
		t.start();
		try {
			synchronized(mc) {
				mc.wait();
			}
		}catch (InterruptedException e) {
			
		}
	System.out.println("main thread total"+mc.total);
	}
}
