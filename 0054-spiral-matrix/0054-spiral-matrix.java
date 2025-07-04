class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        // int n = matrix[0].length;
        // int m = matrix.length;

        // int top = 0;
        // int bottom = m - 1;
        // int left = 0;
        // int right = n - 1;

        List<Integer> ans = new ArrayList<>();

        // while (top <= bottom && left <= right) {

        //     for (int i = left; i <= right; i++) {
        //         ans.add(matrix[top][i]);
        //     }
        //     top++;

        //     for (int i = top; i <= bottom; i++) {
        //         ans.add(matrix[i][right]);
        //     }
        //     right--;

        //     if (top <= bottom) {
        //         for (int i = right; i >= left; i--) {
        //             ans.add(matrix[bottom][i]);
        //         }
        //         bottom--;   // fixed here
        //     }

        //     if (left <= right) {
        //         for (int i = bottom; i >= top; i--) {
        //             ans.add(matrix[i][left]);
        //         }
        //         left++;
        //     }
        // }

        //top, bottom, left, right
		
		int top = 0;
		int bottom = matrix.length-1;
		
		int left = 0;
		int right = matrix[0].length-1;
		while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <=bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >=left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >=top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}
