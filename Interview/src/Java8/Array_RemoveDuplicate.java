package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Array_RemoveDuplicate {
	

	public static void main(String[] args) {
		int[] arr = { 1, 23, 1 };
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] == arr[j]) 
				{
					c++;
					break;
				}

			}
		}
		System.out.println("duplicate Element: " + c);
		int index = 0;
		int[] b = new int[arr.length - c];
		for (int i = 0; i < b.length; i++) {
			int rank = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					rank++;
				}
			}
			if (rank == 1) {
				b[index++] = arr[i];
			}
		}
		for (int m : b) {
			System.out.println(m);
		}

		
		//by using java 8
		List<Integer> aa = Arrays.asList(1, 2, 1, 2);
//		List<Integer>li =aa.stream().distinct().collect(Collectors.toList());
//		System.out.println(li);
		List<Integer> collect2 = aa.stream().distinct().collect(Collectors.toList());
		System.out.println("remove duplicate element: "+collect2);
		Set<Integer> collect = aa.stream().collect(Collectors.toSet());
		System.out.println(collect);
	}
}
