package Java8;

public class sum_first_n_NaturalNum {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(findSum(n));
		System.out.println(secondWay_findSum(n)); // second way using for loop
	}

	private static int findSum(int n) {
		return n * (n + 1) / 2;
	}

	private static int secondWay_findSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;

		}
		return sum;
	}

}
