package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class secondMaxNumber {

public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,3,272,12,43,99);
	 
		//second max element
	
	  Optional<Integer>secondMax=list.stream().distinct().sorted(Comparator.
	  reverseOrder()) .skip(1).findFirst();
	  if(secondMax.isPresent()) {
		  System.out.println("Second max element: "+secondMax.get());
		  
	  }
	  else {
		System.out.println("Not present");
	}
	  
//	  System.out.println(secondMax);
	 
	
	//max element
	OptionalInt maxele = list.stream().mapToInt(Integer::intValue).max();	
	if(maxele.isPresent()) {
		  System.out.println(" max element: "+maxele.getAsInt());
		  
	  }
	  else {
		System.out.println("Not present");
	}
	
	
	Optional<Integer> second = list.stream().distinct().sorted(Collections.reverseOrder())
			.skip(1).findFirst();
	System.out.println(second);
}
}
