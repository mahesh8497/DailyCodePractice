package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class count_characterIn_Word {
public static void main(String[] args) {
	String s = "jarrvajavaeerr";
//	//using collection and for loop
	char ch;
	Map<Character, Integer>mm=new HashMap();
	for(int i=0;i<s.length();i++) {
		ch=s.charAt(i);
		if(mm.containsKey(s.charAt(i))) {
			mm.put(ch, mm.get(ch)+1);
		}
		else {
			mm.put(ch, 1);
		}
	}
	System.out.println(mm);
	
	
	//using java8
	Map<String, Long>map1=Arrays.stream(s.split("")).map(String::toLowerCase)
			.collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));
	System.out.println("Maintain Insertion Order: "+map1);
	
	Map<Character, Long>oc=s.chars()
			.mapToObj(c->(char)c).
			collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));	
	//
    
//    // Creating a character frequency map while preserving insertion order
//    Map<String, Long> map = Arrays.stream(s.split("")) // Split into characters
//        .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
//
//    System.out.println("Count for each character in string: " + map);

	
}
}
