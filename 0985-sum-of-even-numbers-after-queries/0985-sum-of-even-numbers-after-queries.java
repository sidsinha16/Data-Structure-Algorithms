class Solution {
    // total sum of even number
    // iterate as per quearies
    // check value at idx is even then 
    // Subtract TS from idx value before operation
    // do operation -> change value as per queries
    // add new value to TS and store it to new array
    // if odd value, dnt do any opeartion
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