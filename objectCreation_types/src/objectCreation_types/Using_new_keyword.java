package objectCreation_types;
//Using the new keyword in java is the most basic way to create an object. 
//This is the most common way to create an object in java

public class Using_new_keyword {

	int x=133;
	public static void main(String[] args) {

		Using_new_keyword n=new Using_new_keyword();	//object creation
		
		System.out.println(n.x);

		n.getName("chandana");
		
	}
	void getName(String name) {	//creating method

		
		System.out.println(name);
	}
	

}
