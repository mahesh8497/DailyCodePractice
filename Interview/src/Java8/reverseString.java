package Java8;

import java.util.Collections;
import java.util.stream.Collectors;

public class reverseString {
public static void main(String[] args) {
	String s="mahesh";
	String reversed = s.chars().mapToObj(c->(char)c)
			.collect(Collectors.collectingAndThen(Collectors.toList(), list->{Collections.reverse(list);
		return list.stream().map(String::valueOf).collect(Collectors.joining());}
			));
	
	System.out.println("Reversed using Java 8 Stream: " + reversed);
	
	
	
	//second way
	String s1="";
	for (int i =s.length()-1; i >=0; i--)
	{
	  s1=s1+s.charAt(i);
	}
	System.out.println(s1);
}
}
