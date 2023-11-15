package methods;
//a method that calls itself is known as a recursive method. And, this process is known as recursion.
public class Method_Recursion {
	
	static int factorial(int n) {
		if (n!=0) {
			return n * factorial(n-1);
		}else return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5,result;
		result=factorial(num);
		System.out.println("factorial: "+result);

	}

}
