class Solution {
    public void nextPermutation(int[] nums) {
        
        // find the point where we can do swap
        //swap
        //reverse
        int i = nums.length - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find just larger element to swap with
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap them
            swap(nums, i, j);
        }

        // Step 4: Reverse the remaining array
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}