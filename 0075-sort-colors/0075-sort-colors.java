class Solution {
    // take three variable
    // set 0, 0, and n-1
    // check in every iterate the value of 1
    // increase or decrese the idx of variable and swap 
    public void sortColors(int[] nums) {
        int i = 0;
		int j = 0;
		int k = nums.length -1;
		
		while(j <= k) {
			
			if(nums[j] ==  2) {
				swap(nums, j, k);
				k--;
			}else if(nums[j] ==  0) {
				swap(nums, i, j);
				i++;
				j++;
			}else if(nums[j] ==  1) {
				j++;
			}
		}
    }
    private static void swap(int[] nums, int j, int k) {
		int temp = nums[j];
		nums[j] = nums[k];
		nums[k] = temp;
	}
}