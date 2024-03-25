package ProjectEulerSolutionsJava;

import java.util.Scanner;
/*
 * Prime factors of 10 are {2,5} largest is 5 .
 * Prime factor of  17 is 17 itself, hence largest is 17 .
 * 
 */
public class LargestPrimeFactor___3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            long n = in.nextLong();
	            long max=(long)Math.sqrt(n);
	            for(long i=2;i<=max;i++){
	                if(n%i==0){
	                    n=n/i;
	                    i=1;
	                    max=(long)Math.sqrt(n);
	                }
	            }
	            System.out.println(n);
	        }
	}

}
