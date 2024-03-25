package String;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */
 
    String reverse=" ";
    for(int i=A.length()-1;i>=0;i--)
    {
        reverse = reverse+A.charAt(i);
    }
    if(reverse.equals(A))
     System.out.print("Yes");
     else
     System.out.print("No");
    
}

}
