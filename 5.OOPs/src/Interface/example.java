package Interface;
//Default methods are methods that can have a body.
// The most important use of default methods in interfaces is to provide additional functionality to a given type without breaking down the implementing classes.

public interface example {
	
	void say();
	default void talk() {
		System.out.println("its time to talk");
	}
	
}
 class demo implements example{

	
	public void say() {
		System.out.println("say now");
		
	}
	public static void main(String[] args) {
		demo d=new demo();
		d.say();
		d.talk();
	}
}
