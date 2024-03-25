package MultipleThread_ThreadSynchronization;

/*
 * Thread synchronization is a process of allowing only one thread to use the object 
 * when multiple Threads are trying to use the particular object at the same time
 */
public class TSdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String resource1 = "hello hi";
		final String resource2 = "Java Training";
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						}
						synchronized (resource2) {
							System.out.println("Thread 1: locked resource 2");
						}
				}
			}
		};
		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");
						try {
							Thread.sleep(100);
							} catch (Exception e) {
		
							}
							synchronized (resource1) {
								System.out.println("Thread 2: locked resource 1");
							}
				}
			}
		};
		t1.start();
		t2.start();
		
	}

}
