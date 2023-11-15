package Polymorphism;
//declaring 2 methods with same method signature in 2 different classes which are having IS-A relation.
//Private, final and static methods cannot be overridden.
//Whenever child class don't want to use definition written by the Parent class and want to use its own logic.

public class methodOverriding {
	void eat() {
		System.out.println("parent member");
	}
}
	 class member extends methodOverriding {
		void eat() {						//eat() method overridden by memeber class
			System.out.println("child member");
		}
		
	public static void main(String[] args) {

		member m=new member();
		m.eat();		

	}

}
