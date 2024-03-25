package String;

import java.util.Scanner;
/*
 * The first line contains a single string denoting .
 * The second line contains two space-separated integers denoting the respective values of start and end.

Sample Input:  Helloworld
				3 7
Sample Output: lowo
 */
public class javaSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        String result=S.substring(start,end);
	        System.out.println(result);
	    }
	
	

}
