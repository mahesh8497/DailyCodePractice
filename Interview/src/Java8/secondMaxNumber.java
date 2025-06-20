package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class secondMaxNumber {

public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,3,272,12,43,99);
	 
		//second max element
	
	 /* Optional<Integer>secondMax=list.stream().distinct().sorted(Comparator.
	 * reverseOrder()) .skip(1).findFirst(); System.out.println(secondMax);
	 */
	
	//max element
	OptionalInt maxele = list.stream().mapToInt(Integer::intValue).max();	
	System.out.println(maxele);
	
}
}
