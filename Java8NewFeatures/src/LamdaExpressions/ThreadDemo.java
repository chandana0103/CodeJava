package LamdaExpressions;

public class ThreadDemo {

	public static void main(String[] args) {

		Runnable myThread=()->{
			
			//used to set custom name to the current thread
			Thread.currentThread().setName("myThread ");
			System.out.println(Thread.currentThread().getName()+"running ");
		};
		
		Thread run=new Thread(myThread);
		run.start();	//starting thread
	}

}
