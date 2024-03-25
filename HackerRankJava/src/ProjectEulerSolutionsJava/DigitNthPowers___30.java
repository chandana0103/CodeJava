package ProjectEulerSolutionsJava;

import java.util.Scanner;
/*
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 * 1634,8208,9474
 * their sum=19316
 */
public class DigitNthPowers___30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        

        long sum=0;

        for (long i=2; i<1000000; i++) {
            long temp = i;
            long sum1 = 0;

            while (temp > 0) {
                int a = (int)(temp % 10);
                sum1 += (long)Math.pow(a, n);
                temp = temp / 10;
            }
            if (sum1 == i) {
                sum += sum1;
            }
        }

        System.out.println(sum);
	}

}
