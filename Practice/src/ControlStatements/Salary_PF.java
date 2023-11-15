package ControlStatements;
//Provident Fund is 12 % of Basic Salary
import java.util.Scanner;

public class Salary_PF {

	public static void main(String[] args) {
		System.out.println("enter basic salary: ");
		Scanner sc=new Scanner(System.in);
		
		int salary=sc.nextInt();
		int pf=(12*salary)/100;
		
		System.out.println("PF of salary:" +pf);


	}

}
