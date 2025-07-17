package Java8;



import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;   // Sorting by ID (ascending)
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit"));
        list.add(new Student(1, "Mahesh"));
        list.add(new Student(2, "Raj"));

        Collections.sort(list);  // Sorts using compareTo()

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
