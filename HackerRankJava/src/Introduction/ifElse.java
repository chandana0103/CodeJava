package Introduction;

import java.util.Scanner;
/*
 * If N is odd, print "Weird".
If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
If N is even and N>20N>20, print "Not Weird".
We given you partially completed code in the editor, complete it to solve the problem.
 */
public class ifElse {
    public static void main(String[] args) {

    	Scanner scanner =new Scanner(System.in);
	 // int N = scanner.nextInt();
     // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
int N=43;
      if(N%2==1){
          System.out.println("Weird");
      }if (N%2==0)
          if(N>2 &&N<5 || N>20){
       System.out.println("Not Weird");

      }else if (N>2 && N<20){
        System.out.println("Weird");

      }
      }
}
