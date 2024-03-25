package com.abc;

class A{
    int a;
       
    public  void add(){
        System.out.println("add "); 
    }
    class B{
        public  void show(){
            System.out.println("show "); 
    }
    }
}
public class InnerClassDemo {
	
    public static void main(String args[]){

         A obj= new A(); //object creation
         obj.add();      //calling method

         A.B obj1=obj.new B();
         obj1.show();
    }

}
