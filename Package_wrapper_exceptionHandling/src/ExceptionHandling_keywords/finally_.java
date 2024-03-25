package ExceptionHandling_keywords;
/*
 * -> A finally keyword is used to create a block of code that follows a try block.
 * A finally block of code is always executed whether an exception has occurred or not.
 * Using a finally block, it lets you run any clean up type statements that you want to execute, no matter what happens in the protected code.
 * A finally block appears at the end of catch block.
 */
public class finally_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[2];
		System.out.println("start");

		try {
			System.out.println("ff"+a[3]);
		}finally {
			System.out.println("end");

		}
	}

}
