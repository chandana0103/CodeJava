package Java_String_tokenizer;
/*
 * StringTokenizer is a class present in the java.util package and it is used to break a String into tokens based on provided delimiter.
 * Delimiter can be specified either at the time of object creation or on a per-token basis.
 * 
 */
import java.util.StringTokenizer;

//Java program to split a String using space as delimiter

public class splitaStringUsingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer s=new 	StringTokenizer("Welcome to java"," ");
		
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}
