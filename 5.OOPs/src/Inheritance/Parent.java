package Inheritance;

//Accessing parent class method in child class
class Parent {
	public void p1() {
		System.out.println("parent class");
	}
}

class Child extends Parent {
	public void c1() {
		System.out.println("child class");
	}

	public static void main(String[] args) {

		Child obj = new Child();
		obj.p1();
		obj.c1();
		System.out.println("main class");

	}

}
