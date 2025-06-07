class Solution {
    public int[] twoSum(int[] nums, int target) {

        // find reminder
        // see if the reminder is present in hashmap
        // if present then reminder and the current index will be answer
        // if not present then add the current index and value to hashmap

        Map<Integer, Integer> map = new HashMap<>();
        int rem = 0;

        for(int i=0; i<nums.length; i++){
            rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}