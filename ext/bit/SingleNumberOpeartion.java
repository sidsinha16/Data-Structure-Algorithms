package ext.bit;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberOpeartion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,3,3,4};
		singleNumber(arr);
		singleNumberBrutForce(arr);
	}

	private static void singleNumber(int[] arr) {
		// TODO Auto-generated method stub
		
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			res = res^arr[i];
		}
		System.out.println(res);
	}
	
	private static void singleNumberBrutForce(int[] arr) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map = new HashMap();
		int res = 0;
		for(int i=0; i<arr.length; i++) { // n
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1); //logn
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }
		//o(n)*logn + o(m)
	}

}
