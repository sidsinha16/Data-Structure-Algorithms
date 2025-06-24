/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
     public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return list;
    }

    public void dfs(TreeNode node, int depth) {
        if (node == null) return;

        // Add the first node we see at this depth
        if (depth == list.size()) {
            list.add(node.val);
        }

        // Right first, then left
        dfs(node.right, depth + 1);
        dfs(node.left, depth + 1);
    }
}