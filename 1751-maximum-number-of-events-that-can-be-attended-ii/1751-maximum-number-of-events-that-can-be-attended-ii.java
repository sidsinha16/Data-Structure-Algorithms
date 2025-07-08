class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[1]));
        int n = events.length;

        int[] startTimes = new int[n];
        for (int i = 0; i < n; i++) startTimes[i] = events[i][0];

        int[][] dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            int[] curr = events[i - 1];
            int idx = binarySearch(events, curr[0]);

            for (int j = 1; j <= k; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[idx + 1][j - 1] + curr[2]);
            }
        }

        return dp[n][k];
    }

    private int binarySearch(int[][] events, int target) {
        int low = 0, high = events.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (events[mid][1] < target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
