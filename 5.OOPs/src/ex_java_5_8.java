
public class ex_java_5_8 {

	public static void main(String[] args) {
		
		sum(10,23);
		sum(13,93,32);
		sum(14,223,232,43);
		sum(121,234,342,23,23);
	}
	
//write method before java - 5,If we observe above program, we are writing sum ( ) method different arguments. 
//If we want to add 5 numbers or 6 numbers or 7 numbers then writing multiple methods will become difficult.
	/*private static void sum(int a, int b) {
		System.out.println(a+b);
	}
	private static void sum(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	private static void sum(int a, int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
	private static void sum(int a, int b,int c,int d,int e) {
		System.out.println(a+b);
	}
	*/

	//Writing method with var args from Java 1.5 v
	public static void sum(int... x) {
		int total=0;
		for(int i=0;i<x.length;i++) {
			total=total+x[i];
		}
		System.out.println(total);

		
		
		
	}
}
