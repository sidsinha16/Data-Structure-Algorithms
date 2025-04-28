package ext.basics;

public class PivotOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,7,3,6,5,6};

		System.out.println(pivotIndex(arr));
	}
	
	public static int pivotIndex(int[] nums) {

        int total = 0; 
        int lsum = 0;

        for (int j = 0; j < nums.length; j++){
        	total = total + nums[j];
        }
        

        for (int i=0; i < nums.length; i++){
           
        	int rsum = total - lsum - nums[i];
        	
        	if(rsum == lsum) {
        		return nums[i];
        	}
        	
        	lsum = lsum + nums[i];
        }
        return -1;
    }

}
