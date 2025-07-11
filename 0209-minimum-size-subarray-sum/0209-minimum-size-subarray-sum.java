class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i = 0;
        int j = 0;
        int n = nums.length;
        int minWinSize = Integer.MAX_VALUE;
        int sum = 0;

        while(j<n){
            sum = sum + nums[j];

            while(sum >= target){
                System.out.println(j-i+1);
                minWinSize = Math.min(minWinSize, j-i+1);
                System.out.println(minWinSize);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        return minWinSize == Integer.MAX_VALUE ? 0 : minWinSize;
    }
}