package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("hello");
		int[] arr= {20,30,50};
		System.out.println(Arrays.toString(arr));	//arrays class available in java.util package
		
		java.util.Date d=new java.util.Date();	//date class accessing without import keyword
		System.out.println(d);

		FileReader fr=new FileReader("abc.txt");	//filereader class available in java.io package
	}

}
