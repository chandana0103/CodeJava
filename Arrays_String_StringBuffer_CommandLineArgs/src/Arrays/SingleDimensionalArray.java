package Arrays;
//Array is an object which contains elements of similar data type
public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//int[] arr=new int[5];
		int[] arr= {19,24,43,3,32,22};
		
		for(int x:arr) {
			System.out.println(x);
		}
	/*	
		arr[1]=50000;
		System.out.println("element at 1st index: "+arr[1]);*/


		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("element at 1st index: "+arr[1]);
		System.out.println("size of array: "+arr.length);


	}
}
