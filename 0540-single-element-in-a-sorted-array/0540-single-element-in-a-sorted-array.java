class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        while(l<h){
            int mid = l +(h-l)/2;
            int remEle = h-mid;
            if(nums[mid] == nums[mid+1]){
                if(remEle%2 == 0){
                    l = mid+2;
                }else{
                    h = mid-1;
                }
            }else{
                if(remEle%2 == 0){
                    h = mid;
                }else{
                    l = mid+1;
                }
            }
        }
        return nums[h];
    }
}