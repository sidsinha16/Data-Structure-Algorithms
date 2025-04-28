package ext.basics;

import java.util.Arrays;

public class SortAscOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 2, 1, 1, 2 };

		System.out.println(sortColors(arr));

	}

	public static boolean sortColors(int[] nums) {
		
		int s = 0;
		int m = 0;
		int e = nums.length -1;
		
		while(m <= s) {
			
			if(nums[m] == 0) {
				int temp = nums[s];
				nums[s] = nums[m];
				nums[m] = temp;
				m++;
				s++;
			}else if(nums[m] == 1) {
				m++;
			}else {
				int temp = nums[m];
				nums[m] = nums[e];
				nums[e] = temp;
				e--;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		return false;

	}

}
