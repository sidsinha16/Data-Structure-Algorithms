class Solution {
    public int longestValidParentheses(String s) {
        int open = 0, close = 0, ans = 0;

        // Left to right pass
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') open++;
            else close++;

            if (open == close) {
                ans = Math.max(ans, open + close);
            } else if (close > open) {
                open = close = 0;
            }
        }

        // Reset counts
        open = 0;
        close = 0;

        // Right to left pass
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') close++;  // fix here
            else open++;                      // and here

            if (open == close) {
                ans = Math.max(ans, open + close);
            } else if (open > close) {
                open = close = 0;
            }
        }

        return ans;
    }
}
