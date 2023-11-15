package Arrays;

import java.util.Arrays;
//print array elements,calculate sum of array
public class Array_sum {

	public static void main(String[] args) {
		
		int[] ar= {1,2,3,4};
		String[] str= {"ch","dfs","sd"};
		System.out.println(Arrays.toString(ar)+" "+Arrays.toString(str));

	       int sum = 0;  
	       for(int i=0;i<ar.length;i++) {
		       sum = sum + ar[i]; 
		   
	       }
	       //reverse array elements
	       System.out.println(sum);
	       for(int i=ar.length-1;i>=0;i--)
	           System.out.print(ar[i] + "  ");

	      }

	  }



