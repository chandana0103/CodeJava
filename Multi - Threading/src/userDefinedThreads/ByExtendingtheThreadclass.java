package userDefinedThreads;

//If we create any thread by extending Thread class then we have no chance for extending from any other class.

public class ByExtendingtheThreadclass extends Thread{

	//class MyThread extends Thread{
		
		public void run(){
			//statements;
			for(int i=0;i<=10;i++) {
				System.out.println("user thread value "+i);
			}
		}
		public static void main(String[] args) {
			
			ByExtendingtheThreadclass mt=new ByExtendingtheThreadclass();
			
			Thread t=new Thread(mt);
			t.start();
	}
}
