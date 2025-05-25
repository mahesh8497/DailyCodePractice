package Java8;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class removeDupliCharString {
public static void main(String[] args) {
	String s="weewqqwe";
	String collect = s.chars().mapToObj(e->String.valueOf((char)e))
			.collect(Collectors.toCollection(LinkedHashSet::new))
			.stream().collect(Collectors.joining());
	System.out.println(collect);
}
}
