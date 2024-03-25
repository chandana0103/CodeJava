package InterfaceChanges;
// java program on Interface – Default Method
/*
 * default:
 * implementing class can override default methods.
 * 
 * static:
 * This method must be called using interface name.
 * Since these methods are static, we cannot override them in implementing class.
 */

public interface MethodsDemo1 {

	void sayTime();
	static void say() {
		System.out.println("saying");
	}
	default void talk() {
		System.out.println("its time to talk");
	}
class demo implements MethodsDemo1{
	
		public void sayTime() {
			System.out.println("say now");	
		}
		public static void main(String[] args) {
			
			MethodsDemo1.say();	//calling static method
			
			demo d=new demo();
			d.talk();		//calling deafult method
		}
	}

}
