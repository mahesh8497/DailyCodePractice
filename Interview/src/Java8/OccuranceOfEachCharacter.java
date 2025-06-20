package Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEachCharacter {
public static void main(String[] args) {
	String s="asdfgfds";
	Map<Character, Long> occurance = s.chars()
	.mapToObj(c -> (char) c)
	.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	System.out.println(occurance);
	
	Map<String, Long>map2=Arrays.stream(s.split(""))
			.map(String::toLowerCase)
			.collect(Collectors.groupingBy(e->e,Collectors.counting()));
	System.out.println("count each characte: "+map2);
	
	
	//output:  {a=1, s=2, d=2, f=2, g=1}

	
	//remove duplicate element
	
	String removeDpli = s.chars()
	.mapToObj(e->String.valueOf((char)e)).collect(Collectors.toCollection(LinkedHashSet::new))
	.stream().collect(Collectors.joining());
	System.out.println("Duplicate Elemnent: "+removeDpli);
	
	
}
}
