package ext.basics;

public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 1,0,0, 2, 3, 4, 5 };

		System.out.println(findMax(arr));

		System.out.println(findMin(arr));

		System.out.println(sum(arr));
		
		moveZeroes(arr);

	}

	public static int findMax(int[] arr) {

		int ans = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

	public static int findMin(int[] arr) {

		int ans = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

	public static int sum(int[] arr) {

		int ans = arr[0];

		for (int i = 0; i < arr.length; i++) {

			ans = ans + arr[0];
		}
		return ans;
	}

	public static void moveZeroes(int[] nums) {

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
        
        for(int j=0; j < count; j++) {
        	
        	System.out.println(nums[j]);
        }
	}
}
