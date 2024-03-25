package streamAPI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Stream API Interview Questions
1) Getting Min salary emp from collection
2) Getting Max salary emp from Collection
3) Getting Avg Salary of the employee
4) Group By
 */
public class Example {

	public static void main(String[] args) {

		List<Employee> l=new ArrayList<>();
		
		l.add(new Employee("chandu",23,23902));
		l.add(new Employee("anu",43,39302));
		l.add(new Employee("chotu",31,12910));
		l.add(new Employee("rani",29,28319));

		Double avgSal=l.stream()
				.collect(Collectors.averagingInt(emp->emp.getSalary()));
		System.out.println("average sal:: "+avgSal);
		
		Optional<Employee> minEmpSal=l.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("min sal:: "+minEmpSal.get());
		

		Optional<Employee> maxEmpSal=l.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("max sal:: "+maxEmpSal.get());

		Map<String,List<Employee>> col=l.stream()
				.collect(Collectors.groupingBy(Employee::getName));
		
		System.out.println("ny grouping"+col);
		
		
		
	}

}
