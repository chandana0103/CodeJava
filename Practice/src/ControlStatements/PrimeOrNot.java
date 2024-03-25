package ControlStatements;

import java.util.Scanner;

//Write a java program to check given number is prime number or not
public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number."); 
	     
	//Scanner sc=new Scanner(System.in);
	int i,n = 0,count, sum=0;

	int maxValue=10;

	for(num=1; n<=maxValue; num++){
	  count=0;
	  for(i=2; i<=n/2; i++){
	    if(n%i==0){
	      count++;
	      break;
	    }
	}
	if(count==0 && n !=1){
	  sum+=num;
	}
	}
	  System.out.println(sum);
	}
	}
	


