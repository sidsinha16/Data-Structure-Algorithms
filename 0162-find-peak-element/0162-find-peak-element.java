class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid; // Peak is on the left side (including mid)
            } else {
                low = mid + 1; // Peak is on the right side
            }
        }

        return low; // or high, both are equal
    }
}
