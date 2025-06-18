class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> res = new ArrayList<>();

        for (int i = 0; i + 2 < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][];
            }
            res.add(new int[]{nums[i], nums[i + 1], nums[i + 2]});
        }

        return res.toArray(new int[res.size()][]);
    }
}
