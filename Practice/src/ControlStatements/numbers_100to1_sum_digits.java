package ControlStatements;

import java.util.Scanner;

//java program to print numbers from 100 to 1

public class numbers_100to1_sum_digits {

	public static void main(String[] args) {
	//java program to print numbers from 100 to 1
		
			System.out.println("1 to 100 numbers are:");

		for(int i=1; i<=100;i++) {
			
			System.out.println(i);
		}
		
	//a java program to find sum of 1 - 100 numbers
		int n =100;
        int sum = (n)*(n+1)/2;
        	System.out.println("Sum of 1 to 100 numbers: "+sum);

        	
    // find sum of digits of given number 
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int add=0;
        while(num > 0)
        {
        	add = add + num%10;
        	num = num / 10;
        }
        	System.out.println("Sum of Digits:"+add);

	}
}
