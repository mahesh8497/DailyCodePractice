package Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//to find list of uniq words from sentence and sorted alphabetical
public class abc {
public static void main(String[] args) {
	String s=" java is fun and java is powerful";
	List<String>uniqueWords=Arrays.stream(s.trim().split("\\s+"))//s.split(" ")
			.map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
	System.out.println(uniqueWords);
	
	String input = "Java8";
	Map<Character, Long> charCount = input.chars()
	    .mapToObj(c -> (char) c)
	    .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
	System.out.println("Occurance: "+charCount);

	Integer a = 500;
	Integer b = 500;
	System.out.println(a == b); // ❌ false

	Integer c = 5;
	Integer d = 5;
	System.out.println(c == d);
	
	/* Integer a = 5; Integer b = 5;
	Java caches Integer objects for values between -128 to 127.

	So, both a and b point to the same object in memory.

	Therefore, a == b returns true (same reference).

	❌ 2. Integer a = 500; Integer b = 500;
	500 is outside the default Integer cache range.

	So, two separate Integer objects are created.

	Hence, a == b compares different references, and returns false.*/
	
	
	String st1="asd";
	String st2="asd";
	System.out.println(st1==st2);
	System.out.println(st1.equals(st2));
	
}





}
