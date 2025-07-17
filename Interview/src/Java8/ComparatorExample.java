package Java8;
import java.util.*;

class Studentt {
    int id;
    String name;

    public Studentt(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class SortByName implements Comparator<Studentt> {
    @Override
    public int compare(Studentt s1, Studentt s2) {
        return s1.name.compareTo(s2.name);  // Sorting by name (alphabetical)
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Studentt> list = new ArrayList<>();
        list.add(new Studentt(3, "Amit"));
        list.add(new Studentt(1, "Mahesh"));
        list.add(new Studentt(2, "Raj"));

        Collections.sort(list, new SortByName());  // Sort using Comparator

        for (Studentt s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
