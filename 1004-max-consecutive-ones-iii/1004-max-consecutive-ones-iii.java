class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j= 0;
        int max = 0;
        int n = nums.length;
        int ans = 0;

        while(j<n){
            max = max + nums[j];
            while(max + k < j-i+1){
                max = max - nums[i];
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}