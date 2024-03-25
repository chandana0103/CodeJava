package InterfaceChanges;
/*
 * Functional Interfaces
 *  If an interface contains only one abstract method, then it is called as Functional Interface.
 *  Functional Interface is used to invoke lambda expressions
 *  
 */

interface Demo{
	
	//void say();
	public void add(int i,int j);
	
}

//public class FunctionalnterfaceDemo implements Demo{
public class FunctionalnterfaceDemo{
//	public void say() {
//		System.out.println("printing");	
//	}
	public static void main(String[] args) {
		
//		FunctionalnterfaceDemo d1=new FunctionalnterfaceDemo();
//		d1.say();
		
		//using lambda expressions
//		Demo d=()->System.out.println("hello");
//		d.say();
		
		Demo d2=(i,j)->System.out.println("sum: "+(i+j));
		d2.add(23,21);
		d2.add(32,3);
		
	}
}
