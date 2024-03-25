package ProjectEulerSolutionsJava;

import java.util.Scanner;

/*
 * The sum of the squares of the first ten natural numbers is, .
 *  The square of the sum of the first ten natural numbers is, . 
 *  Hence the absolute difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
 *  
 *  input n=10,output=2640(1^2+........10^2=385,(1+2+....10)^2=3025-->>3025-385=2640)
 */
public class SumSquareDifference___6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
         //   int sumOfSquares=n*(n+1)/2;
          //  int squaresofsum=n*(n+1)*(2*n+1)/6;
            //int r1=sumOfSquares*sumOfSquares;
            long sum=(long)Math.pow((n*(n+1))/2, 2);
            long powersum=(n*(n+1)*(2*n+1))/6;
            System.out.println(Math.abs(sum-powersum));
        }
		
	}

}
