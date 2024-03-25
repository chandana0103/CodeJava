package Exception;
/*
 * Checked Exceptions::
 * These are the exceptions that are checked at compile time. 
 * If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the throws keyword.
 * Un Checked Exceptions:
 * Unchecked exceptions are not checked by the compiler. 
 * When the buggy code is executed then we will get exception at runtime, these are called runtime exceptions.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.annotation.processing.Filer;

public class checked_unchecked {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("abc.txt");	//checked exception
		
		
		int i=8;
		int j=0;
		int k=i/j;
		System.out.println(k);		//unchecked exception

	}

}
