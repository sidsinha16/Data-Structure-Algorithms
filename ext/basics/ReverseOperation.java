package ext.basics;

import java.util.Arrays;

public class ReverseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s = { 'H', 'E', 'L', 'K', 'I' };

		reverseString(s);
	}

	public static void reverseString(char[] s) {

		int i = 0;
		int j = s.length - 1;

		while (i <= j) {
			
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(s));
	}
}
