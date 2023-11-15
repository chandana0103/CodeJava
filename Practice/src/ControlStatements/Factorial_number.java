package ControlStatements;

import java.util.Scanner;

// to find factorial of given number
public class Factorial_number {

	public static void main(String[] args) {
		
		System.out.println("enter number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		 int fact=1;
	      /*  for(int i=1;i<=num;i++){
	            fact=fact*i;
	        }*/
	        int i=1;
	        while(i<=num){

	        fact=fact*i;
	        i++;
	    	}
	        System.out.println("Factorial of the number: "+fact); 

	}
	
    
}
