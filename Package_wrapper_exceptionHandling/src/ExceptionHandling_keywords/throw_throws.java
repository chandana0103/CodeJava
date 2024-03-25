package ExceptionHandling_keywords;

import java.io.IOException;

/*
 *  -> The throw keyword is used to throw an exception explicitly.
 *  By default all predefined exceptions are created and thrown implicitly and identified by JVM
 *  If we want to throw the exceptions explicitly then we have to use throw keyword.
 *  -> The throws keyword is used to declare the list of exception that a method may throw during execution of program. 
 *  Any method that is capable of causing exceptions must list all the exceptions possible during its execution, so that anyone calling that method gets a prior knowledge about which exceptions are to be handled. 
 *  A method can do so by using the throws keyword.
 *  
 */
public class throw_throws {
	
	static void check() throws ArithmeticException{
		System.out.println("inside method");
		throw new ArithmeticException("demo");
	}

	public static void main(String[] args){

		System.out.println("start");

		int a=3,b=0,c=0;
	//	a=Integer.parseInt(args[1]);
		//b=Integer.parseInt(args[0]);
		try {
			check();
			if(b==0) {
				ArithmeticException ae=new ArithmeticException("divisible by 0 is not possible");
				throw ae;
			}
			c=a/b;
			System.out.println("division: "+c);
		}catch (ArithmeticException ae){
			System.out.println("caught"+ae);

			System.out.println(ae.getMessage());
		}
		System.out.println("end");
		
	}

}
