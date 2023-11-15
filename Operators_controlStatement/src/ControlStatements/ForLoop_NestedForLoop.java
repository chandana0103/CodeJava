package ControlStatements;

public class ForLoop_NestedForLoop {

	public static void main(String[] args) {
		
		int n=7;
		for(int i=1; i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
		
		for(int x=1; x<=5; x++) {
			for(int j=1; j<=x; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
