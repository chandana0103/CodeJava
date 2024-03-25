package example;
/*
 * For every java program there will be a default thread by JVM which is called as Main Thread.
 * The entry point for Main Thread is main() method
 *
 */
public class main_thread {

	// way to display the info of currently Running Thread
	
	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getThreadGroup());

	}

}
