class Solution {
    public int majorityElement(int[] nums) {
        
        int n       = nums.length;
        int maj     = 0;
        int count   = 0;

        for(int i=0; i<n; i++){
            if(count == 0){
                maj = nums[i];
                count = 1;
            }else if(nums[i] == maj){
                count++;
            }else{
                count--;
            }
        }
        
        return maj;
    }
}