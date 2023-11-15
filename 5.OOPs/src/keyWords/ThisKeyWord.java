package keyWords;
/*
 * this is a keyword which is used to refer current object of a class. 
 * we can it to refer any member of the class. 
 * It means we can access any instance variable and method by using this keyword.
 * main purpose of using this keyword is to solve the confusion when we have same variable name for instance and local variables.
 */
public class ThisKeyWord {

	Double height,weight,breadth;
	
	public ThisKeyWord(double w,double h,double b) {
		
		this.weight =w;
		this.height=h;
		this.breadth =b;
	}

	public static void main(String[] args) {
		
		ThisKeyWord r=new ThisKeyWord(23,13,43);
		
		System.out.println("height:"+r.height);
		System.out.println("weight:"+r.weight);
		System.out.println("breadth:"+r.breadth);

		

	}

}
