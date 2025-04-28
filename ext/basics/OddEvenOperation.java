package ext.basics;

public class OddEvenOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getDigitEven(786));

	}

	public static int getDigitEven(int num) {

		int count = 0;

		while (num > 0) {

			int i = num % 10;
			if (i%2 == 0) {
				count++;
			}
			num = num / 10;
		}
		
		return count;
	}
}