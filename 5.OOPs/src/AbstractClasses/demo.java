package AbstractClasses;
//A class which is declared using abstract keyword known as abstract class.

abstract class demo {
	
	public abstract void result();
}
	
   class example extends demo {
	  public  void result() {
		  System.out.println("ready");
	  }
	

	public static void main(String[] args) {

		demo e=new example();
		e.result();
	}
  
}
