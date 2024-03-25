package MultipleThread_ThreadSynchronization;

/*
 * Daemon threads is a low priority thread that provide supports to user threads. 
 * These threads can be user defined and system defined as well.
 * Garbage collection thread is one of the systems generated daemon thread that runs in background.
 */
public class DaemonThreadDemo extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("deamon thread works");
			
		}else {
			System.out.println("user thread works");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadDemo d1=new DaemonThreadDemo();
		DaemonThreadDemo d2=new DaemonThreadDemo();
		DaemonThreadDemo d3=new DaemonThreadDemo();
		
		d1.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
		
	}

}
