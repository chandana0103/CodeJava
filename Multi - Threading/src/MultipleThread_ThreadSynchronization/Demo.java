package MultipleThread_ThreadSynchronization;

import userDefinedThreads.ByImplementingRunnableInterface;

/*
 * When we execute multiple threads at the same time simultaneously
 * then we never get same output for every execution because 
 * Thread Scheduler will decide which thread should execute in next step.
 * 
 */
public class Demo implements Runnable {

	public void run(){
	
		Thread t=Thread.currentThread();
		
		for(int i=0;i<=5;i++) {
			
			System.out.println(t.getName()+" thread value using run an start "+i);
	}
}
	public static void main(String[] args) {
	
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();

	
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
