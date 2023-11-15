package ControlStatements;

import java.util.Scanner;

// to print mathematical table of given number 
public class maths_table {
	public static void main(String args[]) {
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
	//	int result;
		for(int i=1;i<=10;i++) {
		//	result=num*i;
		//	System.out.println(result);
			System.out.println(num+ "*"+i+"="+num*i);

		}
		
	}

}
