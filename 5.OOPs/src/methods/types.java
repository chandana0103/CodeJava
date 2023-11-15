package methods;
//instance method will be called by using Object
//static method will be called by using Class Name
public class types {
	
	void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);

	}

	void sayHello() {		//instance/non static method
		System.out.println("hello instance method");

	}
	static void print() {	//static method
		System.out.println("hello static method");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		types result=new types();
		result.sum(23,31);
		result.sayHello();
		result.print();
		types.print();	//When we have static method in same class then we can invoke/call it directly without using classname.
	}

}
