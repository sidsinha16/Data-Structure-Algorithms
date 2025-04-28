package ext.basics;

public class MaxSubArrayOpeartions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

		System.out.println(maxSubArray(arr));
	}

	public static int maxSubArray(int[] nums) {

		int sum = 0;
		int ans  = 0;

		for (int i=0; i < nums.length; i++) {
			sum = sum + nums[i];
			
			if(sum < 0) {
				sum = 0;
			}
			
			if(sum > ans) {
				ans = sum;
				System.out.println(ans);
			}
		}
		return ans;
		

	}

}
