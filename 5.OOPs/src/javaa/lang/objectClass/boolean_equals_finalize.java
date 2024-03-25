package javaa.lang.objectClass;
/*
 * 4. boolean equals(Object o):
	this method compares the 2 references whether they contain same object or not by default.
 *  but if we want to compare the equality of the content of 2 objects then we have to override equals() method with in the particular class.
 * 
 * 6. finalize() in Java
 * The finalize() method is called by the Garbage Collector when there are no more references to the object in question.
   Thus, finalize() is called just before an object is garbage collected
 * 
 */
public class boolean_equals_finalize {

	public static void main(String[] args) {

		student s1=new student("chandu");
		student s2=new student("chandu");
		System.out.println(s1.equals(s2));
		
		boolean_equals_finalize b=new boolean_equals_finalize();
		b=null;
		System.gc();
	}
	protected void finalize() {
		System.out.println("finalize method called");

	}
}
	class student {
		String name;
		public student(String name) {
			this.name=name;
		}
		@Override
		public boolean equals(Object obj) {
			student s=(student)obj;
			if(this.name.equals(s.name)) {
				return true;
			}else {
			return false;
			}
		}
		
}
