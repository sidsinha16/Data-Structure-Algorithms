class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int ans = 1;
        for (int i = 0; i < n;) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) j++;
            ans += (j - i - 1);
            i = j;
        }
        return ans;
    }
}