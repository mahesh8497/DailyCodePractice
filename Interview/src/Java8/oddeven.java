package Java8;

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
}
}
