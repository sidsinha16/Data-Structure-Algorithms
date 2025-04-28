/**
 * 
 */
package ext.basics;

/**
 * 
 */
public class NumberOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of natuaral number
		System.out.println(sum(1,3));
		
		System.out.println(sum(3));
		
		//sum of odd
		System.out.println(sumOdd(6));
		
		// Print top 50 Odd
		//printOdd(10);
		
		//doPrintOdd
		//doPrintOdd(50);
		
		//sum of even number
		evenSum();
	}
	
	public static int sum(int start, int end) {
		
		int result = 0;
		
		for(int i=1; i<=3; i++) {
			
			result = result +i;
		}
		
		return result;
		
	}
	
	
	public static int sum(int num) {
		
		int result = (num*(num+1)) / 2;
		return result;
		
	}
	
	public static int sumOdd(int num) {
		
		int result = 0;
		int count = 0;
		
		for(int i=1; count < num; i+=2) {
			
//			if(i%2 == 1)
//				result = result +i;
			result = result +1;
			System.out.println(i);
			
			count++;
		}
		return result;
		
	}
	
	public static void printOdd(int num) {
		
		int i = 0;
		
		while(i<=num) {
			if(i%2 == 1)
				System.out.println(i);
			i++;
		}
		
	}
	

	
	public static void doPrintOdd(int num) {
		
		int i = 0;
		
		do {
			if(i%2 == 1)
				System.out.println(i);
			i++;
		}while(i<=num);
		
	}
	
	public static void evenSum() {
		
		int count = 0;
		int sum = 0;
		
		for(int i=2; count < 63; i+=2) {
			
			System.out.println(count);
			sum = sum+i;
			count++;
		}
		
		System.out.print(sum);
	}
	
	
	

}
