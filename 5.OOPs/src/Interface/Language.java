package Interface;

public interface Language {	//interface creation
	
	void getName(String name);
		
}
class programmingLanguage implements Language{ //class implements interface

	public void getName(String name) {		//implementation of abstract method
		System.out.println("name:"+name);
		
	}
	class main{
		public static void main (String[] args) {
			programmingLanguage p=new programmingLanguage();
			p.getName("chandu");
		}
	}
	
}
