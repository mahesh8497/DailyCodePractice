package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class oddeven {
public static void main(String[] args) {
	int arr[]= {2,3,4,5,6,7,8};
	for(int a: arr) {
		if((a & 1)==0) {  // this is without using % operator (tricky Question) 
			System.out.println(a+" is even");
		}
		else {
			System.out.println(a+" is odd");
		}
	}
	System.out.println("+++++++++=================+++++++++++++++++");
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	 Map<Boolean, Integer> sumEle = numbers.stream()
			 .collect(Collectors.partitioningBy(i->i%2==0,Collectors.summingInt(Integer::intValue)));
	 Integer evensum = sumEle.get(true);
	 Integer oddsum = sumEle.get(false);
	 System.out.println("even sum: "+evensum);
	 System.out.println("odd sum: "+oddsum);
}
}
