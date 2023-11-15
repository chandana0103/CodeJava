package classes_objects_variables;
/*
 * Variables which are declared inside the class and outside the method are called as instance variables.
 * The variables which are declared inside the class and outside the method with 'static' keyword are called as static variables.When class is loaded into JVM then immediately memory will be allocated for static variables.
 * The variables which are declared inside the method or constructor or block are called as Local Variables.Before using local variables, we have to initialize them.
*/
public class Instance_static_local {
	
	String name;				//instance variable
	static String company;
	
	public static void main(String[] args) {
		
		Instance_static_local i=new Instance_static_local();
		i.name="chandana";
		System.out.println(i.name);
		
		Instance_static_local.company="capgemini";	//Initializing static variable
		System.out.println(i.company);

		int a=123; 					//local variable(must be initialized)
		System.out.println(a);

	}

}
