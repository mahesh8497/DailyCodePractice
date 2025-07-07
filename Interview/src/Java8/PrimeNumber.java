package Java8;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		//using java 8
		int number = 88;
        boolean isPrime = number > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(number))
                         .noneMatch(n -> number % n == 0);

        if (isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");	
        
	
        
        
        
        //Using simple  Way 
        
        int numbers = 29;
        boolean isPrimee = true;

        if (numbers <= 1) {
        	isPrimee = false;
        } else {
            for (int i = 2; i <= numbers / 2; i++) {
                if (numbers % i == 0) {
                	isPrimee = false;
                    break;
                }
            }
        }

        if (isPrimee)
            System.out.println(numbers + " is a prime number.");
        else
            System.out.println(numbers + " is not a prime number.");
 
        
        
	
	}
	
}
