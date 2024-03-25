package javaa.lang.objectClass;
//5. Object clone():
//This method used to clone or copy the object so that we can take the backup for the object, 
//but in java every object is created in a way that, it can not be copied directly, if we want to perform this special operations we must follow following rules.
//we must handle an exception called CloneNotSupportedException

 class object_clone implements Cloneable{

	 int n;String name;
	 public object_clone(int n,String name) {
		 this.n=n;
		 this.name=name;
	 }
	public static void main(String[] args)throws CloneNotSupportedException{

		object_clone s=new object_clone(1,"chandu");
		System.out.println(s.n+" "+s.name);	//1 chandu

		
		object_clone s1=s;//shallow or partially cloning
		System.out.println(s1.n+" "+s1.name);	//1 chandu

		object_clone s2=(object_clone) s.clone();//deep cloning
		System.out.println(s2.n+ " " +s2.name);	//79 chandana

		s1.n=79;
		s1.name="chandana";
		System.out.println(s.n+" "+s.name);	//79 chandana
		System.out.println(s1.n+" "+s1.name);	//79 chandana
		
		s2.n=79;
		s2.name="chanti";
		System.out.println(s.n+" "+s.name);	//79 chandana
		System.out.println(s2.n+ " " +s2.name);	//79 chanti


	}

}
