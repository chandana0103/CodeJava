package constructrors;

//A constructor is a special method that is used to initialize an object / instance variables.

public class Demo {

	//instance variable(class level)
	int age;
	String name;

	public Demo() {				//1) 0 parameterized constructor

	System.out.println("call constructor");
	}
	public Demo(int a,String n) {	// 2)parameterized constructor
		age=a;						// intializaion
		name=n;
	}
	Demo(String n){				//	constructor overloding:defining two or more constructors with the same name but with different signatures is called constructor overloading in java
		name =n;
	}

	public static void main(String[] args) {
		
		Demo d=new Demo();			//object creation
		Demo d1=new Demo(23,"chandana");	//declaring values
		System.out.println("Age:"+d1.age);
		System.out.println("name:"+d1.name);
		
		Demo d2=new Demo("chandu");	//declaring values
		//System.out.println(d2.age);
		System.out.println(d2.name);
	}

}
