class Solution {
    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int len = 1;

        while (count < n) {
            for (long i = (long) Math.pow(10, (len - 1) / 2); count < n && i < (long) Math.pow(10, (len + 1) / 2); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                for (int j = len % 2 == 0 ? sb.length() - 1 : sb.length() - 2; j >= 0; j--) {
                    sb.append(sb.charAt(j));
                }
                long num = Long.parseLong(sb.toString());
                if (isPalindrome(Long.toString(num, k))) {
                    sum += num;
                    count++;
                }
            }
            len++;
        }
        return sum;
    }

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
