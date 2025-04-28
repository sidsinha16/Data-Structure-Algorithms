package ext.bit;

public class SetBitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkSetBit(13 , 2);
		
		setBit(9, 2);
		
		clearBit(13, 2);
		
		toggleBit(13, 1);
		
		removeSetBit(7);
		
		System.out.println(checkPowoftwo(7));
		
		System.out.print(countSetBit(16));

	}

	private static int countSetBit(int i) {
		int count = 0;
		
//		while(i > 0) {
//			if(i%2 == 1) {
//				count++;
//			}
//			i = i/2;
//			
//			if(i == 1) {
//				count++;
//				return count;
//			}
//		}
		
		// bit ways
//		count = 0;
		
		while(i > 0) {
			
			if((i & 1) == 1) {
				count++;
			}
			i = i >> 1; // right shift means diving by 2
			
			if(i == 1) {
				count++;
				return count;
			}
		}
		return count;
	}

	private static boolean checkPowoftwo(int i) {
		// TODO Auto-generated method stub
		
		// every power of 2 has 1 setbit -> 100000
		
		boolean check = false;
		
		if((i & (i-1)) == 0) {
			return true;
		}
		return check;
	}

	private static void removeSetBit(int i) {
		// TODO Auto-generated method stub
		
		// 13 -> 1101 -> 1100
		// 16 -> 10000 -> 00000
		
		// -> 16 -> 10000 , 15-> 01111 => 00000 -> 0 
		
		int temp = i & (i-1);
		System.out.println(temp);
		
	}

	private static void toggleBit(int i, int j) {
		// TODO Auto-generated method stub
		// first left bit 1 by j and then do XOR with i  -> 1 , => 0
		int temp = 1 << j;
		temp = i ^ temp;
		
		System.out.println(temp);
		
	}

	private static void clearBit(int i, int j) {
		// TODO Auto-generated method stub
		
		// left bit of 1 by J and Not operator and then AND with i
		// 1101 -> 1001
		
		int temp = 1 << j;
		temp = ~temp;
		temp = i & temp;
		
		System.out.println(temp);
		
	}

	private static void setBit(int i, int j) {
		// TODO Auto-generated method stub
		
		//left bit of 1 with J.. and then OR Operator with num and temp
		
		int temp = 1 << j;
		System.out.println(temp);
		
		System.out.println(temp);
		temp = i | temp;
		System.out.println(temp);
		
	}

	private static boolean checkSetBit(int num, int place) {
		// TODO Auto-generated method stub
		
		//left opeartor of num with place.. and then AND Operator with num and temp
		
		//using left shift
		int temp = num << place;
		int bol = (num & temp);
		
		System.out.println(bol);
		
		
		
		//using right shift
		temp = num >> place;
		bol = temp & 1;
		
		System.out.println(bol);
		
		if(bol != 0) {
			return true;
		}
		return false;
		
	}
	
	

}
