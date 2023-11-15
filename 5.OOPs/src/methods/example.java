package methods;

public class example {
	void add() {				//Method without parameters & without return type
		int a=10, b=20;
		int c=a+b;
		System.out.println("add: "+c);
	}

	void sum(int p,int q) {		//Method with parameters & without return type
		int r=p+q;
		System.out.println("sum: "+r);
	}
	
	int addition() {			//Method with return type & without parameters
		int l=45, m=55;
		int n=l+m;
		return n;	
	}
	
	int summation(int i,int j) {	//Method with return type & with parameters
		int k=i+j;
		return k;
	}
	public static void main(String[] args) {
		example e=new example();
		e.add();
		e.sum(20,30);
		System.out.println("addition: "+e.addition());
		System.out.println("summation: "+e.summation(73,32));

	}

}
