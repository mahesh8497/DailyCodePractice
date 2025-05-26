package Java8;

import java.util.Arrays;
import java.util.List;

public class Stream {
public static void main(String[] args) {
	List<String>list1=Arrays.asList("one","two","three");
	java.util.stream.Stream<String> stream = list1.stream();
	System.out.println(stream);
}
}
