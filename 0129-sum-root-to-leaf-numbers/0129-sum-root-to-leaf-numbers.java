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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        preorder(root, "");
        return sum;
    }

    void preorder(TreeNode root, String temp){
        if(root == null) return;

        temp = temp+""+root.val;
        if(root.left == null && root.right == null){
            sum = sum+Integer.parseInt(temp);
        }

        preorder(root.left, temp);
        preorder(root.right, temp);


    }
}