package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class odd_even_java8 {
	public static void main(String[] args) {
		List<Integer>listOfIntegers=Arrays.asList(1,2,3,4,5,6,7,6,5,4,3,2,4,1);
		Map<Boolean, List<Integer>> oddEvenNumbersMap = listOfIntegers.stream()
				.collect(Collectors.partitioningBy(i->i%2==0));
	    
	    Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
	    for (Entry<Boolean, List<Integer>> entry : entrySet) 
	    {
	        System.out.println("--------------");
	         
	        if (entry.getKey())
	        {
	            System.out.println("Even Numbers");
	        }
	        else
	        {
	            System.out.println("Odd Numbers");
	        }
	         
	        System.out.println("--------------");
	         
	        List<Integer> list = entry.getValue();
	         
	        for (int i : list)
	        {
	            System.out.println(i);
	        }
	    }
		
		
	}

	
//    Map<Boolean, List<Integer>> oddEvenNumbersMap = 
//            listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
//     
//    Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();

}
