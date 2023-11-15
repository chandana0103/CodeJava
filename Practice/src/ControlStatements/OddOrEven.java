package ControlStatements;

import java.util.Scanner;

//Write a java program to check given number is even number or odd number
public class OddOrEven {
	
	static int odd() {
		
		int n=100;  
	     System.out.print("List of even numbers from 1 to 100: \n");  
	     for (int i=2; i<=n; i= i+2)   
	     {
	         System.out.print(i + " ");
	     }
		return 0;
 }  

	public static void main(String[] args) {
		
		odd();
		System.out.println("enter number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		//int num=23;
		if (num%2==0) {
			System.out.println("number is even");
		}else {
				System.out.println("number is odd");
			}
		}

	}