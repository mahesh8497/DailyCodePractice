package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class longestString {
	public static void main(String[] args) {
		String s="ndijn abdibcs  njadbkja da  aid aid isdb isbisbfisbf";
		String longestWord = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
		int length = longestWord.toCharArray().length;
		System.out.println(length);
		System.out.println("Longest word:  "+ longestWord);
		
		//remove duplicate
		String collect = Arrays.stream(longestWord.split("" )).filter(q->!q.isEmpty()).distinct().collect(Collectors.joining(" "));
		System.out.println("remove duplicate: " +collect);
		
		
		Map<String, Long>map2=Arrays.stream(longestWord.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));
		System.out.println("count each characte: "+map2);
	}

}
