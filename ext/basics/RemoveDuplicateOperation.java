package ext.basics;

import java.util.Arrays;

public class RemoveDuplicateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 0, 1, 1, 2, 2, 3, 4, 4};

		System.out.println(RemoveDuplicateColors(arr));
		
		

	}

	private static int RemoveDuplicateColors(int[] arr) {
		
		int s=1;
		/* a[0] = 0;
		 * a[1] = 1;
		 * a[2] = 
		 * 
		 */
		
		
		for(int e=1; e< arr.length;e++) {
			
			if(arr[e] != arr[e-1]) {
				System.out.println("s"+s);
				arr[s] =  arr[e];
				s++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		return s;
	}

}
