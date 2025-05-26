package Java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class startWith_1 {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10, 1, 12, 1, 3, 6, 12);
		
		 li.stream()
        .map(s -> s + "") // Convert integer to String
        .filter(s -> s.startsWith("1"))
        .forEach(System.out::println);
	}

}
