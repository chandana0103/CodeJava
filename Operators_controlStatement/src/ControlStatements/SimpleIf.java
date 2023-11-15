package ControlStatements;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
	
		Scanner read =new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=read.nextInt();
		
		if((num%5)==0) {
			System.out.println("given number is divisible by 5");
		}

	}

}
