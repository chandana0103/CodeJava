package classes_objects_variables;
//When we create Object for class, then JVM will assign unique hashcode for every object
public class HashCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashCodeEx h=new HashCodeEx();
		System.out.println(h.hashCode());

		HashCodeEx h1=new HashCodeEx();
		System.out.println(h1.hashCode());

	}

}
