package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedNumber {
	  public static void main(String args[]) {
          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          Set<Integer> set = new HashSet();
          myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
  }

}

//98, 15 /* Example 98 and 15 are the only repeated values in the list */