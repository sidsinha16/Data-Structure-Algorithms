class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int m = mat.length, n = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        // Step 1: Group elements by diagonals
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                map.computeIfAbsent(i - j, k -> new PriorityQueue<>()).add(mat[i][j]);
            }
        }

        // Step 2: Overwrite matrix with sorted diagonals
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mat[i][j] = map.get(i - j).poll();
            }
        }

        return mat;
    }
}