package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicateNumber {
	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		    Set<Integer> set = new HashSet<>(myList);
		    
		    // Convert the set back to a list if needed
		    List<Integer> uniqueData = set.stream().collect(Collectors.toList());
		      
		    // Print the unique elements
		    uniqueData.forEach(System.out::println);
	}
	
   
}
