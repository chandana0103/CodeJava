package Introduction;

import java.util.Scanner;

public class StacticIntializer {
	 public static boolean flag = true;
     public static int B;
     public static int H;
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
     /*   Scanner sc=new Scanner(System.in);
        int B=sc.nextInt();
        int H=sc.nextInt();
        
        if(H>0 && B>0){
            System.out.println(H);
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        */
        Scanner sc1=new Scanner(System.in);
            int B=-54;//=sc1.nextInt();
            int H=6353;//sc1.nextInt();
            
           if (B<0 || H<0) {
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            if (B==0 && H==100) {
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
    
}
