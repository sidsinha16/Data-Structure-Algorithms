package ext.twoArray;

public class TwoDArraySumOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{1,2},{1,2}};
		System.out.println(sum(matrix)); 

	}
	
	public int[][] transpose(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        int[][] ans = new int[c][r];   
        for(int i=0; i<r; i++){
             for(int j=0; j<c; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
	
	
	public static int sum(int[][] arr) {
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				sum = sum+arr[i][j];
			}
		}
		return sum;
	}
	
	public void rotate(int[][] matrix) {
        
        int n  =matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        for(int i=0; i<n; i++){
        int l = 0;
        int h = n-1;

            while( l<h ){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][h];
                matrix[i][h] = temp;
                l++;
                h--;
            }
        }
    }

}
