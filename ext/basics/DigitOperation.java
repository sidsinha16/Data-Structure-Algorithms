package ext.basics;

public class DigitOperation {

	public static void main(String[] args) {
		
		System.out.println(sumDigit(12345));
		
	}
	
	public static int sumDigit(int num) {
		
		int result = 0;
		
		while(num > 0) {
			int i = num%10;
			result = result+i;
			num = num/10;
		}
		
		return result;
		
	}
}
	
