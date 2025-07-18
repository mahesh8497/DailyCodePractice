package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
public static void main(String[] args) {

	
	List<Employee>employees=employeeList();
	
	
	//Get All employee List
	
	  List<String> collect =employees.stream().map(emp->emp.getName()).collect(Collectors.toList());
	  System.out.println(collect);
	
	
	//employee name salary >70k
	
	List<String> collect1=employees.stream().filter(emp->emp.getSalary()>70000).map(emp->emp.getName()).collect(Collectors.toList());
	System.out.println("salary greater than 70k: "+collect1);
	
	
	//count of emp whos salary >70k 
	long collect2=employees.stream().filter(emp->emp.getSalary()>70000).count();
	System.out.println("salary greater than 70k: "+collect2);
	
	
	//ALL city  names of the employee
	employees.stream().map(e->e.getCity()).distinct().forEach(System.out::println);
	
	
	//Second max salary
	Optional<Double> first = employees.stream().map(Employee::getSalary).distinct()
			.sorted(Comparator.reverseOrder()).skip(1).findFirst();
	if(first.isPresent()) {
		System.out.println("second max salary: "+first.get());
	}
	else {
		System.out.println("Not present");
	}
	
}
	
	public static List<Employee>employeeList(){
		List<Employee>employeeList=new ArrayList<Employee>();
		
		employeeList.add(new Employee(1, "Amit", "Mumbai", "Male", "IT", 2018, 75000));
		employeeList.add(new Employee(2, "Sneha", "Pune", "Female", "HR", 2019, 68000));
		employeeList.add(new Employee(3, "Raj", "Pune", "Male", "Finance", 2020, 72000));
//		employeeList.add(new Employee(4, "Priya", "Pune", "Female", "IT", 2017, 80000));
//		employeeList.add(new Employee(5, "Vikram", "Pune", "Male", "Marketing", 2016, 67000));
//		employeeList.add(new Employee(6, "Neha", "Hyderabad", "Female", "Finance", 2019, 71000));
//		employeeList.add(new Employee(7, "Rohit", "Pune", "Male", "IT", 2015, 88000));
//		employeeList.add(new Employee(8, "Kavita", "Mumbai", "Female", "HR", 2021, 64000));
//		employeeList.add(new Employee(9, "Suresh", "Mumbai", "Male", "Admin", 2014, 60000));
//		employeeList.add(new Employee(10, "Meena", "Pune", "Female", "IT", 2022, 70000));
		return employeeList;
		
	}


}
