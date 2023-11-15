package recursion;

public class min_value_array {
	
	static int findMin(int a[],int n) {
		if(n==0) {
			return a[0];
		}else
		
		return Math.min(a[n-1],findMin(a,n-1));		//a[4],5,4
	}
	
	static int findMax(int a[],int n) {
		if(n==0) {
			return a[0];
		}else
		
		return Math.max(a[n-1],findMax(a,n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,45,11,-1,31};
		int n=a.length;
		System.out.println("smallest:"+findMin(a, n));
		System.out.println("largest:"+findMax(a, n));
		
		 //Initialize array  
        int [] arr = new int [] {-5, 1, 7, 6, 3};  
        int min = arr[0];
        int max = arr[0];  

        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
           if(arr[i] < min )  
               min = arr[i]; 
        }  
       System.out.println("Smallest element present in given array: " + min);
        
       for (int i = 0; i < arr.length; i++) { 
        if(arr[i]>max)
        	max=arr[i];
       }
        System.out.println("largest element present in given array: " + max);  

    	} 

}
