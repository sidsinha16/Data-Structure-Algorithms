class Solution {
    public int search(int[] nums, int target) {
        // sorted array
        int low = 0;
        int high = nums.length -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) {low = mid+1; }// mid bdda h to left ko right me shift kro
            else {high = mid-1;} // mid bdda h to high ko left me shift kro
        }

        return -1;
    }
}