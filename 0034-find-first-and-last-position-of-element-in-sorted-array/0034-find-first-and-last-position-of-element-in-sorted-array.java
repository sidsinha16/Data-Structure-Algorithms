class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        if(n == 0)
            return new int[] {-1,-1};
        
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                int f = mid;
                int s = 0;
                if(mid>0 &&nums[f] == nums[mid-1]){
                    s = mid-1;
                }
                if(mid<n-1 && nums[f] == nums[mid+1]){
                    s = mid+1;
                }
                return new int[]{ s,f };
            }else if (nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return new int[] {-1,-1};
    }
}