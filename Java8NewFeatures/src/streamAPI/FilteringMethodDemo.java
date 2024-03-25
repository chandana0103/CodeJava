package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * -> filter( ) method will take Predicate as input
 *  Predicate is a functional interface which will take input 
 *  and returns boolean value
 */

class Person{
	private String name;
	private Integer age;
	private String job;
	
	public Person(String name, Integer age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
}
public class FilteringMethodDemo {

	public static void main(String[] args) {

		Stream<Integer> si=Stream.of(2,6,3,77,2,32);
//		//Java program to filter the numbers which are > =20
////		Stream<Integer> si1=si.filter(i->i>=6);
////		si1.forEach(i->System.out.println(i));
////		
		si.filter(i->i>=20).forEach(System.out::println);
		
		// Java program to filter the names which are starting with ”A”
		
		List<String> l=new ArrayList<>();
		l.add("hello");
		l.add("anu");
		l.add("where");
		l.add("now");
		l.add("arthi");

		
		Stream<String> sm=l.stream();
		sm.filter(name->name.startsWith("A")).forEach(System.out::println);
		
		// Java Program To Filter Person Objects
		Person p1=new Person("chandu",23,"software");
		Person p2=new Person("chotu",28,"driver");
		Person p3=new Person("anu",29,"teacher");
		Person p4=new Person("varun",22,"chef");
		Person p5=new Person("rani",24,"software");
		
		List<Person> lp=Arrays.asList(p1,p2,p3,p4,p5);
		
		lp.stream()
			.filter(p->p.getAge()>21&&p.getAge()<30 && p.getJob().equals("software"))
			.forEach(System.out::println);

	}

}
