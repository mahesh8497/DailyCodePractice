package Java8;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class removeDupliCharString {
public static void main(String[] args) {
	String s="weewqqwe";
	String collect = s.chars().mapToObj(e->String.valueOf((char)e))
			.collect(Collectors.toCollection(LinkedHashSet::new))
			.stream().collect(Collectors.joining());
	System.out.println(collect);//weq
	
	
	
	//second way without java8
	String s1="";
	for (int i = 0; i < s.length(); i++) 
	{
	int rank=0;
	for (int j = 0; j <i; j++) 
	{
		if(s.charAt(i)==s.charAt(j))
		{
			rank++;
			break;
		}
	}
	if(rank==0)
		s1=s1+s.charAt(i);
	}
	System.out.println(s1);//weq
	
}
}
