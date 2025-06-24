class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
    List<Integer> result = new ArrayList<>();
    int n = nums.length;
    List<Integer> keyIndices = new ArrayList<>();

    // Step 1: Collect indices where nums[i] == key
    for (int i = 0; i < n; i++) {
        if (nums[i] == key) keyIndices.add(i);
    }

    // Step 2: Mark valid ranges using a boolean array
    boolean[] isValid = new boolean[n];
    for (int index : keyIndices) {
        int start = Math.max(0, index - k);
        int end = Math.min(n - 1, index + k);
        for (int i = start; i <= end; i++) {
            isValid[i] = true;
        }
    }

    // Step 3: Add valid indices to result
    for (int i = 0; i < n; i++) {
        if (isValid[i]) result.add(i);
    }

    return result;
}

}