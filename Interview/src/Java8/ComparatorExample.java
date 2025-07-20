package Java8;

import java.util.*;

class Studentt {
	int id;
	String name;
	long salary;

	public Studentt(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

class SortByName implements Comparator<Studentt> {
	@Override
	public int compare(Studentt s1, Studentt s2) {
		return s1.name.compareTo(s2.name); // Sorting by name (alphabetical)
	}
}

class SortBysalary implements Comparator<Studentt> {
	@Override
	public int compare(Studentt o1, Studentt o2) {
		return Long.compare(o1.salary, o2.salary);
	}

}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Studentt> list = new ArrayList<>();
		list.add(new Studentt(3, "Amit", 30000));

		list.add(new Studentt(1, "Mahesh", 80000));
		list.add(new Studentt(2, "Raj", 75000));

		 Collections.sort(list, new SortByName()); // Sort using Comparator
		//Collections.sort(list, new SortBysalary());
		for (Studentt s : list) {
			System.out.println(s.id + " " + s.name + " " + s.salary);
		}
	}
}
