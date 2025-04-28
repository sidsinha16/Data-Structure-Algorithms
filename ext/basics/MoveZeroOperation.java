package ext.basics;

public class MoveZeroOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	 public void moveZeroes(int[] nums) {
         
         int nonzero = nums[0];
         int count = 0;
         for(int i=0; i < nums.length; i++){
             if(nums[i] != 0 ){
             nums[count] = nums[i]; 
             count++;
             }
         }

         
         while(count < nums.length){
             nums[count] = 0;
             count++;
         }
     }

}
