package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class count_characterIn_Word {
	public static void main(String[] args) {
		String s = "jarrvajavasbsiubisbviusbiuocbiseerr";
//	//using collection and for loop
		char ch;
		Map<Character, Integer> mm = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (mm.containsKey(s.charAt(i))) {
				mm.put(ch, mm.get(ch) + 1);
			} else {
				mm.put(ch, 1);
			}
		}
		System.out.println("Using Collection: " + mm);// {a=4, r=4, b=5, s=5, c=1, u=3, e=2, v=3, i=5, j=2, o=1}

	Map<String, Long> collect = Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println("each character : "+collect);
		
		
		Optional<Map.Entry<String, Long>> secondMaxEntry = collect.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())).skip(1) // skip the max
				.findFirst(); // get the second max

		if (secondMaxEntry.isPresent()) {
			System.out.println("Second most frequent character: " + secondMaxEntry.get().getKey() + " (count: "
					+ secondMaxEntry.get().getValue() + ")");
		} else {
			System.out.println("No second most frequent character found.");
		}

//	//using java8
		Map<String, Long> map1 = Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
		System.out.println("Maintain Insertion Order: " + map1);

		Map<Character, Long> oc = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("using collection for character : " + oc);
		//

//    // Creating a character frequency map while preserving insertion order
		Map<String, Long> map = Arrays.stream(s.split("")) // Split into characters
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

		System.out.println("Count for each character in string: " + map);

	}
}
