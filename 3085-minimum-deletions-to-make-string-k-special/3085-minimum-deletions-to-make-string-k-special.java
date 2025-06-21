import java.util.*;

class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        List<Integer> list = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) list.add(f);
        }

        Collections.sort(list);
        int ans = Integer.MAX_VALUE;

        for (int t : list) {
            int deletions = 0;
            for (int f : list) {
                if (f < t) deletions += f; // delete all to raise to t
                else if (f > t + k) deletions += f - (t + k);
            }
            ans = Math.min(ans, deletions);
        }

        return ans;
    }
}
