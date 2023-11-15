package Strings;

import java.util.Scanner;

public class palindrome_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string:");
	      String str = sc.nextLine();
	 
	      String rev = "";
	      int length = str.length();
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	      
	      int n = 1233424221;
	      int temp = palindrome(n, 0);
	      System.out.println(temp);
	      if (temp == n)
	          System.out.println("yes");
	      else
	          System.out.println("no" );
	}

	static int palindrome(int n,int temp) { //using recursion method
		if (n==0) 
			return temp;
		 temp = (temp * 10) + (n % 10);
		 
		    return palindrome(n / 10, temp);	
	}
}
