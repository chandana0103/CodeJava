package readerWriterFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//java program to create and write data to a file
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myFile=new File("demo1.txt"); //file will be stored in excution directory
		try {
			FileWriter fw=new FileWriter(myFile);
			fw.write("learning file classes");//this text will be saved in demo1.txt file
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("completed");
		
		//java program to read data from file
		
		File myFile1=new File("demo.txt");
		try {
			Scanner sc=new Scanner(myFile1);
			while(sc.hasNextLine()) {
				String s=sc.nextLine();
			}sc.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("read");

		//// java program to delete file
		
		File myFile2=new File("demo2.txt");
		if(myFile2.delete()) {
			System.out.println("i have deleted"+myFile2.getName());

		}else {
			System.out.println("some problem");

		}

	}

}
