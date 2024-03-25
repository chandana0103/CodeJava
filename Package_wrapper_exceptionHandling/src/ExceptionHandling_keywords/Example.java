package ExceptionHandling_keywords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class AgeException extends Exception{
		AgeException(String msg){
		 super(msg);
	 }
}
public class Example {

	public static void main(String[] args)throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter age:");
		int age=Integer.parseInt(br.readLine());
		try {
			if(age<18) {
				AgeException ae=new AgeException("not in age,wait for "+(18-age)+" years");
				throw ae;
			}
			System.out.println("eligible");

		}catch(AgeException ae) {
			System.out.println(ae);

		}
	}

}
