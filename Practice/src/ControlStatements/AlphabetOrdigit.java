package ControlStatements;

import java.util.Scanner;

//Write a java program to check given character is alphabet or digit
public class AlphabetOrdigit {

	public static void main(String[] args) {
		
		System.out.println("enter number: ");
		Scanner sc=new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		if (ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
			System.out.println("This is a Alphabet");
		}
		
		else if(ch>='0' && ch<='9') {
			System.out.println("This is a Number");
		}
		else
		{
			System.out.println("This is a Special Character");
	    }
	}

}
