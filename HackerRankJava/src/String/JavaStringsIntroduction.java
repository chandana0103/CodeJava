package String;

import java.util.Scanner;

/*
 * There are three lines of output:
 * For the first line, sum the lengths of  and .
 * For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
 * For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
 * Sample Input 0
  	hello
	java
*  Sample Output 0
	9
	No
	Hello Java
 */
public class JavaStringsIntroduction {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    /* Enter your code here. Print output to STDOUT. */
    System.out.println(A.length()+B.length());
    int i=A.compareTo(B);
    if(i>0){
        System.out.println("Yes");
        
    }else{
        System.out.println("No");

    }
    A=A.substring(0,1).toUpperCase()+A.substring(1);
    B=B.substring(0,1).toUpperCase()+B.substring(1);

         System.out.println(A+" "+B);
   
}
}

