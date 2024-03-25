package objectCreation_types;
//If we know the name of the class & if it has a public default constructor we can create an object Class.forName. We can use it to create the Object of a Class. 
//Class.forName actually loads the Class in Java but doesn’t create any Object

public class Using_new_instance {

		 void message()
		 {
			 System.out.println("Hello Java");
			 }  
		 
		 public static void main(String args[]){  
			 
		  try{  
			  
		  Class c=Class.forName("Simple");  
		  Using_new_instance s=(Using_new_instance)c.newInstance();  
		  s.message();  
		  
		  }catch(Exception e)
		  {
			  System.out.println(e);
			  }  
		  
		 }  
		}  
