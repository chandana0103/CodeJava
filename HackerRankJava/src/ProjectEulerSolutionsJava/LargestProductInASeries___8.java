package ProjectEulerSolutionsJava;

import java.util.Scanner;
/*
 * Find the greatest product of k consecutive digits in the n digit number.
 * input:					output:
 * 	10 5					
 	3675356291				3150
	10 5
	2709360626				0
 */
public class LargestProductInASeries___8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            
            int max=1;
            for(int i=0;i<n-k;i++){
                int max2=1;
                for(int j=i;j<i+k;j++){
                    int a=(int)num.charAt(j)-'0';
                    max2=max2*a;
                }
             max=Math.max(max2,max);
            if(max==1){
                max=0;
            }
        }
        System.out.println(max);
            
        }
	}

}
