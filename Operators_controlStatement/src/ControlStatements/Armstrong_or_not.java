package ControlStatements;

import java.util.Scanner;

public class Armstrong_or_not {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();//takes number
		int result=0;		 //creates result variables and takes 0
		int temp=num;		//
		
		while(num>0) {
			
			int m=num%10;
			result=result+(m*m*m);//153=1*1*1+5*5*5+3*3*3*
			num=num/10;	
		}
		if(temp==result) {
			System.out.println("Yes it is :");

		}
		else {
			System.out.println("is not armstrong num :");

		}
		System.out.println("1 to 1000 armstrong numbers are: ");
		for(int i = 1; i <= 1000; i++)
        {
            num = i;
            while(num > 0)
            {
               int m = num % 10;
                result = result + (m * m * m);
                num = num / 10;
            }
            if(result == i)
            {
                System.out.print(i+" , ");
            }
            result = 0;
        }

	}

}
