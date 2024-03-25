package ProjectEulerSolutionsJava;

import java.util.Scanner;

/*'
 * If we list all the natural numbers below  that are multiples of 3 or 5, we get3,5,6  and 9 . The sum of these multiples is 23 .
 * Find the sum of all the multiples of  3 or 5 below N.
 */
public class Multiplesof3and5___1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	       
	       int t = sc.nextInt();
	       //long t = sc.nextLong();
	      for (int i = 0; i < t; i++) {
	       
	        int n= sc.nextInt();//10, 100

	            long a = 0, b = 0, d = 0;

	            a = (n-1)/3;  // 9/3=3   99/3=33   
	            b = (n-1)/5;  // 9/5=1    99/5=19
	            d = (n-1)/15; // 9/15=0     99/15=6

	            long sum3 = 3*a*(a+1)/2;    //3*3*(3+1)/2=18, 3*33*(33+1)/2=1683
	            long sum5 = 5*b*(b+1)/2;    //5*1*(1+1)/2=15 ,5*19*(19+1)/2=950
	            long sum15 = 15*d*(d+1)/2;  //15*0*(0+1)/2=0, 15*6*(6+1)/2=315
	            long c = sum3 + sum5 - sum15;//18+15-0=23, 1683-950-315=2318
	            System.out.println(c);
	      }
	      
	      
	}

}
/*
 * another solution::
 * 
 * 
 *  public static long ans(long n){
        //n * (n - 1)/2
        long three = 0, first = 0, five = 0, second = 0, extra = 0, third = 0;
        if(n%3 == 0){
            three = n/3;
            first = 3*((three * (three - 1))/2);
        }else{
            three = n/3;
            first = 3*((three * (three + 1))/2);
        }

        if(n%5 == 0){
            five = n/5;
            second = 5*((five * (five - 1))/2);
        }else{
            five = n/5;
            second = 5*((five * (five + 1))/2);
        }

         if(n%15 == 0){
            extra = n/15;
            third = 15*((extra * (extra - 1))/2);
        }else{
            extra = n/15;
            third = 15*((extra * (extra + 1))/2);
        }
        
        

        return first + second - third;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(ans(n));
        }
    }
 */

