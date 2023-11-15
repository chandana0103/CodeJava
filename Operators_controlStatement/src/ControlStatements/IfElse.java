package ControlStatements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner read =new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=read.nextInt();
		
		if((num%2)==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}

	}

}
