class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int ts = 0;
		int[] res = new int[queries.length]; 
		for(int num : nums) {
			if(num%2==0) ts = ts+num;
		}
		
		for (int i = 0; i < queries.length; i++) {
			
			int[] temp = queries[i];
			int val = nums[temp[1]];
			
			if(val%2 == 0) {
				ts = ts-val;
			}
			nums[temp[1]] = val+temp[0];
			val = nums[temp[1]];
			if(val%2 == 0) {
				ts = ts+val;
			}
			
			res[i] = ts;
		}
		return res;
    }
}