package ext.twoArray;

import java.util.Arrays;

public class TwoDOpeations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 2, 3 }, { 3, 4, 5 } };

		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		sum(arr);
		transpose(arr1);

	}

	public static int sum(int[][] arr) {

		int sum = 0;
		int col = arr[0].length;
		int row = arr.length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				//System.out.println(arr[i][j]);
				sum = sum + arr[i][j];
			}
		}
		//System.out.println(sum);
		return sum;
	}

	// Transpose array
	public static void transpose(int[][] arr) {
		
		/*[2,4,-1]
		  [10,5,11]
		  [18,-7,6]
		*/
		/*[2,10,18]
		  [4,5,-7]
		  [-1,11,6]
		*/
		
		int top = 0;
		int row = arr.length;
		int col = arr[0].length;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(i+""+j);
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		//System.out.println(Arrays.toString(arr));
	}
}
