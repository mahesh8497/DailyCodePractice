package Java8;

import java.util.*;
import java.util.stream.*;

class Employeee {
    private String name;
    private double salary;

    public Employeee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class SecondMaxSalry {
	public static void main(String[] args) {
		List<Employeee>emp=Arrays.asList(
				new Employeee("Mahesh", 5000),
				new Employeee("sham", 300),
				new Employeee("ram", 4000),
				new Employeee("om", 3400),
				new Employeee("kl", 8900),
				new Employeee("rahul", 7844)
				);
		Optional<Double> first = emp.stream().map(Employeee::getSalary)
				.distinct().sorted(Comparator.reverseOrder())
		.skip(1).findFirst();
		System.out.println(first);
	}

}
