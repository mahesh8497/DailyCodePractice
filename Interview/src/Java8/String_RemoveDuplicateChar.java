package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class String_RemoveDuplicateChar {
	public static void main(String[] args) {
		String s="asfdssas";
		List<String> collect = s.chars().distinct().mapToObj(e->String.valueOf((char)e)).collect(Collectors.toList());
		System.out.println(collect);
		//Output: [a, s, f, d]
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			int rank=0;
			for (int j = i+1; j < s.length(); j++)
			{
				if(s.charAt(j)==ch) {
					rank++;
				}
			}
			if(rank==0) {
				System.out.print(ch+" ");
			}
		}
		
		// output: f d a s 
		
	}

}

