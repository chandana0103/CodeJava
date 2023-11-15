package Arrays;

public class min_max_elements {

	//print min and max elements in array
	//print second min and second max elements in array
	public static void main(String[] args) {
		
		int arr[]= {23,43,38,21,564,455,65,76};
		int max=arr[0],min=arr[0];
		
		int sec_max=Integer.MIN_VALUE;
		int sec_small=Integer.MAX_VALUE;
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			//print second min and second max elements in array
			if(arr[i]<sec_small && arr[i]>min) {
				sec_small=arr[i];
			}
			if(arr[i]>sec_max && arr[i]<max) {
				sec_max=arr[i];
			}
		}
		System.out.println("max number: "+max);
		System.out.println("min number: "+min);
		System.out.println("second small number: "+sec_small);
		System.out.println("second max number: "+sec_max);
	}

}
