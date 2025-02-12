package Java8;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mahesh";
		reverseString(s);
		System.out.println(reverseString(s));
	}

	private static String reverseString(String s) {
		// TODO Auto-generated method stub
		char[] charArray = s.toCharArray();
	    int left = 0;
	    int right = charArray.length - 1;

	    while (left < right) {
	        // Swap the characters
	        char temp = charArray[left];
	        charArray[left] = charArray[right];
	        charArray[right] = temp;
	        left++;
	        right--;
	    }
	    return new String(charArray);
	}
		
	

}
