package ext.bit;

public class MaxBitChangeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countChangeSetBit(6 , 8);

	}

	private static void countChangeSetBit(int i, int j) {
		// TODO Auto-generated method stub
		
		int x = i ^ j;
		int count = 0;
		
		while(x !=0) {
			x = x&(x-1);
			count++;
		}
		
		System.out.println(count);
		
	}

}
