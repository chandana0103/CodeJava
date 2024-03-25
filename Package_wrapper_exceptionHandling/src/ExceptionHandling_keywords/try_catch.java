package ExceptionHandling_keywords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.imageio.IIOException;

/*
 * try: The try block is used to enclose the suspected code. 
 * Suspected code is a code that may raise an exception during program execution.
 * catch : The catch block also known as handler is used to handle the exception. 
 * It handles the exception thrown by the code enclosed into the try block. 
 * Try block must provide a catch handler or a finally block.
 * 
 */
public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=8;
			int j=0;
			int k=i/j;
			System.out.println("try block excutes:"+k);
		}catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("catch block1:");
		}
		System.out.println("after exception handled");
		
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))){
			boolean str;
			while((str=br.readLine()!=null)) {
				System.out.println(str);
			}
		}catch (IOException  ie) {
				System.out.println(ie);
				System.out.println("catch block2:");
			}
		
		//We can handle multiple Exceptions in Single Catch block also like below
		try(FileReader fr=new FileReader(new File("abc.txt"))){
			DriverManager.getConnection("url","name","password");
		}catch(IOException | SQLException se) {
			System.out.println("catch block3:");

		}
		}

	}
