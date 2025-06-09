class Solution {

    // transpose of Matrix
    // i -> 0 to n 
    // j -> 0 to i
    //swap

    // rotate image
    // iterate over row
    // swap left & right
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