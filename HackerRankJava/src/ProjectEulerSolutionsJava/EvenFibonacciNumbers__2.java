package ProjectEulerSolutionsJava;

import java.util.Scanner;

/*
 * By considering the terms in the Fibonacci sequence-1,2,3,5,8,13.... whose values do not exceed , 
 * find the sum of the even-valued terms.
 * for n=10 we have 2,8=10
 * for n=100 we have 2,8,34=44
 */
public class EvenFibonacciNumbers__2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	        long n = in.nextLong();	//10			n=100
	            
	            long prev = 0;
	            long current = 2;		//8			
	            long sum =0;
	            while ( current < n){	//2<10-true,8<10-true
	                sum += current;	//sum=0+2=2,0+8=8
	                long temp = 4*current + prev;	//temp=4*2+0=8,4*8+2=34
	                prev = current;		//prev=2,prev=8
	                current = temp;		//current =8 current=34
	            }
	            System.out.println(sum);	//sum=8,
	        }        
	}

}
