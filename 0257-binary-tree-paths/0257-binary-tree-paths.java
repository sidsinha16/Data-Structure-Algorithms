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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        func(root, "", list);
        return list;
    }

    void func(TreeNode root, String path, List<String> paths){
        if( root != null){

            path += Integer.toString(root.val);
            if(root.left == null && root.right == null){
                paths.add(path);
                path += "->";
            }
            func(root.left, path + "->", paths);
            func(root.right, path + "->", paths);
        }
    }
}