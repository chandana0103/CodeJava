package keyWords;
//super keyword is used to refer to immediate parent class of a child class.
//In other words super keyword is used by a subclass whenever it need to refer to its immediate super class.

public class SuperKeyWord {		//parent class
	String name;
	public SuperKeyWord(String n) {	//constructor
		name=n;
}
	void details() {			//parent class method
		System.out.println(name.toUpperCase());
		
	}
}
	
 class Child extends SuperKeyWord{
		String name;
			
		//Example of Child class calling Parent class constructor using super keyword
		//When calling the parent class constructor from the child class using super keyword, super keyword should always be the first line in the method/constructor of the child class.
		public  Child(String n1,String n2) {	//constructor
			super(n1);
			this.name=n2;
			System.out.println(super.name+" ..., "+name);

		}
		
		public void details() {		//child class method
			super.name="parent";	//refers to parent class member
			name="child";
			System.out.println(super.name+" , "+name);
			super.details();		//refers to parent class method
		}

	public static void main(String[] args) {

		Child c=new Child("parent1", "child1");
		c.details();		//calls child class method

	}
	
}
