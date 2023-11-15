package recursion;
//using recursion method
public class palindrome_or_not {
	static int palindrom(int n,int temp) { //n=23224,temp=0
		if(n==0)							// n!=0
			return temp;
		temp=(temp*10)+(n%10);				//temp=0+4=4
		return palindrom(n/10,temp);		//2322,4
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=23224;
		int temp=palindrom(n,0);
		if (temp==n) {
			System.out.println("yes palindrome");
		}else {
			System.out.println("not palindrome");

		}
	}

}
