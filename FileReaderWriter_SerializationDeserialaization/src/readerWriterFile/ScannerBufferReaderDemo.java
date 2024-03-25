package readerWriterFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerBufferReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//scanner class
		Scanner sc=new Scanner(System.in);
		
		System.err.println("enter string");
		String s=sc.next();
		System.out.println("str= "+s);
		
		System.err.println("enter int");
		int i=sc.nextInt();
		System.out.println("int= "+i);
		
		System.err.println("enter double");
		double d=sc.nextDouble();
		System.out.println("double= "+d);
		
		System.err.println("enter charcter");
		char ch=sc.next().charAt(0);
		System.out.println("ch= "+ch);
		sc.close();
		
		//buffer class
		File myFile1=new File("demo.txt");
		try {
			FileReader fr=new FileReader(myFile1);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line !=null) {
				System.out.println(line);
			}br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
