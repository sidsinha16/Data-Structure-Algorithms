class Solution {
    public String orderlyQueue(String s, int k) {
        
        if (k > 1) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			return new String(arr);
		}

		int n = s.length();
		String result = s;
		for (int i = 1; i < n; i++) {
			String temp = s.substring(i) + s.substring(0, i);
			if(temp.compareTo(result) < 0 ) {
				result = temp;
			}

		}
		
		return result; // Missing return
    }
}