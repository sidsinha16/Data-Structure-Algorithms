class Solution {

    public static void getAllSubset(int[] nums, List<List<Integer>> ans, List<Integer> temp, int i, int n) {

        Arrays.sort(nums);
        
        if (i == n) {
            ans.add(new ArrayList<>(temp));  // ✅ Correct: add a *copy* of the current subset
            return;
        }

        // Include nums[i]
        temp.add(nums[i]);
        getAllSubset(nums, ans, temp, i + 1, n);


        // Exclude nums[i]
        temp.remove(temp.size() - 1);

        int idx = i+1;
        while(idx < nums.length && nums[idx] == nums[idx-1]) idx++;

        getAllSubset(nums, ans, temp, idx, n);
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();  // ✅ Use diamond operator
        int n = nums.length;
        getAllSubset(nums, ans, new ArrayList<>(), 0, n);
        return ans;
    }

    
}