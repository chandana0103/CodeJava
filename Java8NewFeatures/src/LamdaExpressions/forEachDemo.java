package LamdaExpressions;

import java.util.ArrayList;
import java.util.List;

/*
 * It is a default method defined in the Iterable interface. 
 * Collection classes which extends Iterable interface can use forEach loop to iterate elements.
 */

//// Java program to print list data with for-each loop

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
}
public class forEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emps=new ArrayList<>();
		emps.add(new Employee(101,"Rani"));
		emps.add(new Employee(103,"Raju"));
		emps.add(new Employee(102,"Anu"));
		
		// Java program to print list data with for-each loop

		for(Employee e:emps) {
			System.out.println("for each loop --"+e.id+" == "+e.name);		
			
		}
		// Java program to print list data with foreach method
		
		emps.forEach(e->{
			System.out.println("for each method--"+e.id+" =-= "+e.name);
		});
				
	
		ArrayList<String> list=new ArrayList<String>();  
		   list.add("vimal");  
		   list.add("sonoo");  
		   list.add("ratan");  
//		   //traversing the list of elements using for-each loop  
//		   for(String s:list){  
//		     System.out.println(s); 
//		   }
		   list.forEach(e1->{
			   System.out.println(e1);
		   });
	}

}
