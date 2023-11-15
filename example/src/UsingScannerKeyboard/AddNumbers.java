package UsingScannerKeyboard;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first num");
		int a=sc.nextInt();
		
		System.out.println("Enter secong num");
		int b=sc.nextInt();
		
		int add=a+b;
		System.out.println("Result: " +add);
		
	}

}
