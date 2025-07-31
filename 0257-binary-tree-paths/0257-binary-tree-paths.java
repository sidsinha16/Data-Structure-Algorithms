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
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String str = "";
        preorder(root, str);
        return ans;
    }

    void preorder(TreeNode root, String str){
        if(root == null){
            return;
        }

        str = str+""+root.val;
        if(root.left == null && root.right == null){
            ans.add(str);
        }

        preorder(root.left, str+"->");
        preorder(root.right, str+"->");
    }
}