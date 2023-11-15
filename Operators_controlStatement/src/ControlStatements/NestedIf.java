package ControlStatements;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		Scanner read =new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=read.nextInt();
		
		if(num < 100) {
			System.out.println("given number is below 100");
			if(num % 2 == 0)
				System.out.println("it is even");
			else
				System.out.println("it is odd");
		} else 
			System.out.println("given num is not below 100");

	}

}
