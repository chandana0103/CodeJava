package ControlStatements;
//Write a java program to check given number is divisible by 5 or not
import java.util.Scanner;

public class divisibleByNumber {

	public static void main(String[] args) {
		

		System.out.println("enter number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		//int num=23;
		if (num%5==0) {
			System.out.println("divisible by 5");
		}else {
				System.out.println("not divisible by 5");
			}

	}

}
