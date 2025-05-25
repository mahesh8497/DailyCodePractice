package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//to find list of uniq words from sentence and sorted alphabetical
public class abc {
public static void main(String[] args) {
	String s=" java is fun and java is powerful";
	List<String>uniqueWords=Arrays.stream(s.split(" "))
			.map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
	System.out.println(uniqueWords);
	
	String input = "Java8";
	Map<Character, Long> charCount = input.chars()
	    .mapToObj(c -> (char) c)
	    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println("Occurance: "+charCount);
	
	
	
}


}
