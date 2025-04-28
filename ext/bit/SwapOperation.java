package ext.bit;

import java.util.ArrayList;
import java.util.List;

public class SwapOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swap(5,6);
		swapUsingTemp(5,6);
	}
	
	public static List<Integer> swap(int a, int b) {
		
		List<Integer> list = new ArrayList<>();
		
		a = a ^ b;
		
		b = (a ^ b); // (a^b)^b = a
		a = (a ^ b); // (a^b)^a = b
		
		
		list.add(a);
		list.add(b);
		
		return list;
		
	}
	
	public static List<Integer> swapUsingTemp(int a, int b) {
		
		List<Integer> list = new ArrayList<>();
		
		int temp = a;
		a = b;
		b = temp;
		
		list.add(a);
		list.add(b);
		
		return list;
		
	}
	
	

}
