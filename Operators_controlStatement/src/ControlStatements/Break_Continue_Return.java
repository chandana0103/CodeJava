package ControlStatements;

public class Break_Continue_Return {

	public static void main(String[] args) {
		
		for (int i=1; i<10;i++) {
			if(i==8) {
				break;
			}
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Hi");
		if(10>2) {
			return;
		}
		System.out.println("bye");
	}
}
