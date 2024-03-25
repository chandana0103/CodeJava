package Introduction;

import java.util.Scanner;

/*
 * Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
 */
public class Loops {

	 public static void main(String[] args) {
		    
		   // Scanner sc=new Scanner(System.in);
		  //  int n=sc.nextInt();
		    int n=3;
		    int i;
		    for(i=1;i<=10;i++){
		        int result=n*i;
		        System.out.println(n+" x "+i+" = "+result);
		    }    
		    
/*
 * a+20b,a+20b+21b,......,a+20b+21b+...+2n−1ba+20b,a+20b+21b,......,a+20b+21b+...+2n−1b

Input Format
The first line will contain the number of testcases t. Each of the next tt lines will have three integers, aa, bb, and nn.

Constraints:
0≤t≤5000≤t≤500
0≤a,b≤500≤a,b≤50
1≤n≤151≤n≤15

Output Format
Print the answer to each test case in separate lines.

Sample Input
2
0 2 10
5 3 5
Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/
	 Scanner in = new Scanner(System.in);
     int t=in.nextInt();

     for(int i1=0;i1<t;i1++){
         int a = in.nextInt();
         int b = in.nextInt();
         int n1 = in.nextInt();
         for (int j=0;j<n1;j++){
          a+=(Math.pow(2,j)*b);   
          System.out.print(a+" ");
         }
         System.out.println();
     }
}
}
