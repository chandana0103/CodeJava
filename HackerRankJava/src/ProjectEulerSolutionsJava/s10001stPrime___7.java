package ProjectEulerSolutionsJava;

import java.util.Scanner;
/*
 * By listing the first six prime numbers:  2,3,5,7,11 and 13, we can see that the 6th prime is 13 .
 * input=6,output=13
 */
public class s10001stPrime___7 {

		 public static boolean isPrime(int n){
	         if (n<=1) { return false; } 
	         if (n<=3) { return true; }
	         if (n%2==0 || n%3==0) {
	            return false; 
	         }  for (int i=5; i*i<=n; i+=6) { 
	               if (n%i==0 || n%(i+2)==0) { 
	                 return false;
	                }
	            } return true;
	    }
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	       for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            if (n==1) {
	            System.out.println("2");
	            }
	            int count=1,num=3;   
	             while (count < n) {
	                if (isPrime(num)) {
	                     count++;
	                }
	                if (count==n) {
	                    System.out.println(num);
	                }
	                num += 2; 
	            }
	       }
	        
	    }

}
