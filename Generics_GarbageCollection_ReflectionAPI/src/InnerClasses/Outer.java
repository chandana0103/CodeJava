package InnerClasses;
/*
 * If a class is declared with in another class, then this concept is called as Inner classes or nested classes
 */

// Creating an object for Regular Inner class inside the instance methods of Outer class
public class Outer {

	int x=0;
	static int y=20;
	
	class Inner{
		
		void innerMethod() {
			System.out.println("inner method");
		}
	}
	
	static class Inner1 {
		void innerMethod1() {
			System.out.println("Static inner method");
			//System.out.println("x= "+x); //invalid because its not static

			System.out.println("y= "+y);
		}
	}
	void outerMethod() {
		
		Inner i=new Inner();
		i.innerMethod();
		System.out.println("outer method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer o=new Outer();
		o.outerMethod();
		
		Outer.Inner1 i1=new Outer.Inner1();
		i1.innerMethod1();
		
	}

}
