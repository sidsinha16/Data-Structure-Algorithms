class Solution {

    public int findPivot(int[] nums){
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return r;
    }

    public int binarySearch(int[] nums, int l, int r, int target){
        int idx = -1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                idx = mid;
                break;
            }else if(nums[mid] < target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return idx;
    }

    public int search(int[] nums, int target) {
        int pivot_idx = findPivot(nums);
        System.out.println(pivot_idx);

        int idx = binarySearch(nums, 0, pivot_idx-1, target);
        
        if(idx != -1){
            return idx;
        }

        idx = binarySearch(nums, pivot_idx, nums.length-1, target);

        return idx;
    }


}