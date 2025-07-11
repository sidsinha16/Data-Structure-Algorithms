class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int max = 0;

        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                max = Math.max(max, j-i+1);
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}