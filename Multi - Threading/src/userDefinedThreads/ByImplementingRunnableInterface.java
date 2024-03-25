package userDefinedThreads;

//-> But if we create any thread by implementing Runnable interface then we have a chance for extending from any one class.

/*
 * We can call run() method directly but no thread will be created / registered with
 * Thread scheduler but run()method executes like a normal method by Main Thread.
 * 
 * 
 * But if we call start() method thread will be registered with 
 * thread scheduler and it calls run() method. 
 */
public class ByImplementingRunnableInterface implements Runnable {

	public void run(){
	
		Thread t=Thread.currentThread();
		
		for(int i=0;i<=5;i++) {
		
			System.out.println("user thread value "+i);
		
			System.out.println(t.getName()+" thread value using run an start "+i);
	}
}
	public static void main(String[] args) {
	
		ByImplementingRunnableInterface mt=new ByImplementingRunnableInterface();
	
		Thread t=new Thread(mt);
		//t.start();			//main thread value using run an start 3(OUTPUT)
		t.run();			//Thread-0thread value using run an start 3(output)
	}
}



