class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n = nums.length;
        double maxAvg = 0;
        double sum = 0;
        int i = 0;

        while(i<n && i<k){
            sum += nums[i];
            i++;
        }
        maxAvg = sum;

        for(i=1; i<=n-k; i++){
            sum = sum + nums[i+k-1] - nums[i-1];
            maxAvg = Math.max(maxAvg, sum);
        }

        return maxAvg/k;
    }
}