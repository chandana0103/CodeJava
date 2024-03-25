package Interface;

//The static methods in interfaces are similar to default methods but the only difference is that you can’t override them.

public interface ex2_static_method {

	static void say() {
		System.out.println("now say");
	}
}
 class demo1 implements ex2_static_method{
	public static void main(String []args) {
		
		ex2_static_method.say();
	}

}