class Solution {

    public static void getAllSubset(int[] nums, List<List<Integer>> ans, List<Integer> temp, int i, int n) {
        if (i == n) {
            ans.add(new ArrayList<>(temp));  // ✅ Correct: add a *copy* of the current subset
            return;
        }

        // Include nums[i]
        temp.add(nums[i]);
        getAllSubset(nums, ans, temp, i + 1, n);

        // Exclude nums[i]
        temp.remove(temp.size() - 1);
        getAllSubset(nums, ans, temp, i + 1, n);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();  // ✅ Use diamond operator
        int n = nums.length;
        getAllSubset(nums, ans, new ArrayList<>(), 0, n);
        return ans;
    }
}
