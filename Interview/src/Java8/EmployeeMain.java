package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
public static void main(String[] args) {

	
	List<Employee>employees=employeeList();
	
	
	//Get All employee List
	Stream<Employee> stream = employees.stream();
	List<String> collect = stream.map(emp->emp.getName()).collect(Collectors.toList());
	System.out.println(collect);
	
	
	
	
	
}
	
	public static List<Employee>employeeList(){
		List<Employee>employeeList=new ArrayList<Employee>();
		
		employeeList.add(new Employee(1, "Amit", "Mumbai", "Male", "IT", 2018, 75000));
		employeeList.add(new Employee(2, "Sneha", "Pune", "Female", "HR", 2019, 68000));
		employeeList.add(new Employee(3, "Raj", "Delhi", "Male", "Finance", 2020, 72000));
		employeeList.add(new Employee(4, "Priya", "Bangalore", "Female", "IT", 2017, 80000));
		employeeList.add(new Employee(5, "Vikram", "Chennai", "Male", "Marketing", 2016, 67000));
		employeeList.add(new Employee(6, "Neha", "Hyderabad", "Female", "Finance", 2019, 71000));
		employeeList.add(new Employee(7, "Rohit", "Ahmedabad", "Male", "IT", 2015, 88000));
		employeeList.add(new Employee(8, "Kavita", "Kolkata", "Female", "HR", 2021, 64000));
		employeeList.add(new Employee(9, "Suresh", "Mumbai", "Male", "Admin", 2014, 60000));
		employeeList.add(new Employee(10, "Meena", "Pune", "Female", "IT", 2022, 70000));
		return employeeList;
		
	}


}
