package ProjectEulerSolutionsJava;

import java.util.Scanner;
/*
 * 2520 is the smallest number that can be divided by each of the numbers from  1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible(divisible with no remainder) by all of the numbers from  1 to N ?
 * 
 * input=3 output=6 -->>6 is devisble by{1,2,3}giving quotient of{6,3,2}
 * input=10 output=2520
 */
public class SmallestMultiple___5 {

	  private  static  int gcd(int a,int b){
	        if (b == 0) {
	        return a;
	    }
	    return gcd(b, a%b);
	    }
	   
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        int product;
	        for(int a0 = 0; a0 < t; a0++){
	            
	            int n = in.nextInt();
	            int ans = 1;
	            for (int i=2; i<=n; i++) {
	                ans = (ans*i)/gcd(ans, i);
	            }
	            System.out.println(ans);
	        }
	         
	    }

}
