package Interface;
//Functional Interfaces are introduced to invoke Lambda Expressions
//Functional interfaces are new additions in Java 8. As a rule, a functional interface can contain exactly one abstract method. 
//These functional interfaces are also called Single Abstract Method interfaces (SAM Interfaces).

@FunctionalInterface
interface functional {
	
	 void say(String msg);
}
 class demo2 implements functional{

	
	public void say(String msg) {

		System.out.println(msg);
	}
	public static void main(String args[]) {
		
		demo2 d=new demo2();
		d.say("hello functional interface");
	}
	
}
